package com.lja.sdn.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lja.sdn.entity.Attack;
import com.lja.sdn.result.R;
import com.lja.sdn.service.AttackService;
import com.lja.sdn.util.LinuxUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lja
 * @since 2022-06-15
 */
@CrossOrigin
@RestController
@RequestMapping("/sdn/attack")
public class AttackController {

    @Autowired
    private AttackService attackService;

    private static int count;

    private static List<Attack> attackList = new ArrayList<>();

    /**
     * 获取历史攻击记录--分页
     *
     * @param current 当前页面
     * @param limit 每页条数
     * @return
     */
    @GetMapping("getAttackListPage/{current}/{limit}")
    public R getHostListPage(@PathVariable Long current, @PathVariable Long limit) {
        Page<Attack> page = new Page<>(current, limit);
        attackService.page(page, new QueryWrapper<Attack>().orderByDesc("attackTime"));
        List<Attack> records = page.getRecords();
        long total = page.getTotal();
        return R.ok().data("attackList", records).data("total", total);
    }

    /**
     * 获取攻击信息
     * @return
     */
    @GetMapping("getAttackList")
    public R getAttackList() {
        if (count < 1){
            LinuxUtils.copyFile(LinuxUtils.conn,LinuxUtils.remotePath + LinuxUtils.fileName,LinuxUtils.localPath1);
            try {
                FileUtils.copyFile(new File(LinuxUtils.localPath1 + LinuxUtils.fileName),new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            attackList = LinuxUtils.getAttackList(LinuxUtils.localPath2 + LinuxUtils.checkName);
            this.saveAttackList(attackList);
            count++;
        }else {
            LinuxUtils.copyFile(LinuxUtils.conn,LinuxUtils.remotePath + LinuxUtils.fileName,LinuxUtils.localPath1);
            try {
                boolean b = FileUtils.contentEquals(new File(LinuxUtils.localPath1 + LinuxUtils.fileName), new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
                System.out.println(b);
                if (!b) {
                    FileUtils.copyFile(new File(LinuxUtils.localPath1 + LinuxUtils.fileName),new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
                    attackList = LinuxUtils.getAttackList(LinuxUtils.localPath2 + LinuxUtils.checkName);
                    this.saveAttackList(attackList);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Map<String, Object> map = new HashMap<>();
//        int i = attackList.size() - 1;
        //统计所有攻击次数和本次所受攻击次数
        //所有攻击次数
        int allCount = attackService.count(null);
        //本次攻击次数
        LambdaQueryWrapper<Attack> lwq = new LambdaQueryWrapper<Attack>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH");
        String dateTime = dateTimeFormatter.format(LocalDateTime.now());
        lwq.like(Attack::getAttackTime,dateTime);
        int thisCount = attackService.count(lwq);

        map.put("switchId",attackList.get(0).getSwitchId());
        map.put("inPort",attackList.get(0).getInPort());
        //尝试添加源IP
        map.put("srcIp",attackList.get(0).getSrcIp());
        map.put("dstIp",attackList.get(0).getDstIp());
        map.put("allCount",allCount);
        map.put("thisCount",thisCount);
        return R.ok().data("attackInfo",map);
    }

    /**
     * 保存attackList到数据库
     *
     * @param attackList 攻击信息条目
     */
    public void saveAttackList(List<Attack> attackList) {
        if (!CollectionUtils.isEmpty(attackList)) {
            for (Attack attack : attackList) {
                attackService.save(attack);
            }
        }
    }

    /**
     * 最近200次被攻击主机及时间集合
     *
     * @return 返回最近200次被攻击的主机和被攻击的时间
     */
    @GetMapping("getTimeHosts")
    public R getTimeHosts() {
//        Map<String, Object> timeHosts = attackService.getTimeHosts();
//        return R.ok().data(timeHosts);
        Map<String, Object> timeHosts = attackService.get200Times();
        return R.ok().data(timeHosts);
    }
}

