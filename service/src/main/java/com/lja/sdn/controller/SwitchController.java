package com.lja.sdn.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lja.sdn.entity.Switch;
import com.lja.sdn.entity.SwitchDTO;
import com.lja.sdn.result.R;
import com.lja.sdn.service.SwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
@CrossOrigin
@RestController
@RequestMapping("/sdn/switch")
public class SwitchController {

    @Autowired
    private SwitchService switchService;

    /**
     * 获取所有交换机--分页
     * @param current 当前页码
     * @param limit 每页条数
     * @return 返回交换机列表
     */
    @GetMapping("getSwitchListPage/{current}/{limit}")
    public R getSwitchListPage(@PathVariable Long current, @PathVariable Long limit) {
        Page<Switch> page = new Page<>(current, limit);
        switchService.page(page, null);
        List<Switch> switchList = page.getRecords();
        long total = page.getTotal();
        return R.ok().data("switchList", switchList).data("total", total);
    }

    /**
     * 获取所有交换机，不分页
     * @return
     */
    @GetMapping("getSwitchList")
    public R getSwitchListPage() {
        List<Switch> switchList = switchService.list(null);
        List<SwitchDTO> switchDTOList = switchList.stream().map((item) -> {
            SwitchDTO switchDTO = new SwitchDTO();
            switchDTO.setPort(item.getPorts());
            switchDTO.setMac(item.getMac());
            switchDTO.setIpv6(item.getIpv6());
            return switchDTO;
        }).collect(Collectors.toList());
        return R.ok().data("switchList", switchDTOList);
    }

    /**
     * 添加交换机
     * @param s 交换机对象实体
     * @return 返回添加结果
     */
    @PostMapping("addSwitch")
    public R addSwitch(@RequestBody Switch s) {
        switchService.save(s);
        return R.ok();
    }

    /**
     * 修改交换机
     * @param s 交换机对象实体
     * @return 返回修改结果
     */
    @PutMapping("updateSwitch")
    public R updateSwitch(@RequestBody Switch s) {
        switchService.updateById(s);
        return R.ok();
    }

    /**
     * 删除交换机
     * @param id 根据交换机id删除
     * @return 返回删除结构
     */
    @DeleteMapping("{id}")
    public R delSwitch(@PathVariable Integer id) {
        switchService.removeById(id);
        return R.ok();
    }

    /**
     * 根据id查找交换机
     * @param id 根据交换机id查找信息
     * @return 返回交换机实体信息
     */
    @GetMapping("{id}")
    public R getSwitchById(@PathVariable Integer id) {
        Switch sw = switchService.getById(id);
        return R.ok().data("switch",sw);
    }
}

