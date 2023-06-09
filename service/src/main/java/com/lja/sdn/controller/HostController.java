package com.lja.sdn.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lja.sdn.entity.Host;
import com.lja.sdn.entity.HostDTO;
import com.lja.sdn.result.R;
import com.lja.sdn.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lja
 * @since 2023-06-11
 */
@CrossOrigin
@RestController
@RequestMapping("/sdn/host")
public class HostController {

    @Autowired
    private HostService hostService;

    /**
     * 获取所有主机
     * @return 返回所有主机列表
     */
//    @GetMapping("listHost")
//    public R listAcl() {
//
//        return R.ok().data("hostList", hostService.list(null));
//    }
    @GetMapping("listHost")
    public R listAcl() {
        List<Host> list = hostService.list(null);
        List<HostDTO> dtoList = new ArrayList<>();
        for (Host host : list) {
            HostDTO hostDTO = new HostDTO();
            hostDTO.setIp(host.getIp().substring(2));
            hostDTO.setMac(host.getMac());
            dtoList.add(hostDTO);
        }
        return R.ok().data("hostList", dtoList);
    }

    /**
     * 获取所有主机--分页
     * @param current 当前页面
     * @param limit 每页条数
     * @return 返回所有主机信息的分页结果
     */
    @GetMapping("getHostListPage/{current}/{limit}")
    public R getHostListPage(@PathVariable Long current, @PathVariable Long limit) {
        Page<Host> page = new Page<>(current, limit);
        hostService.page(page, null);
        List<Host> records = page.getRecords();
        long total = page.getTotal();
        return R.ok().data("hostList", records).data("total", total);
    }

    /**
     * 添加主机
     * @param host 主机信息，对象类型
     * @return 返回添加成功/失败信息
     */
    @PostMapping("addHost")
    public R addHost(@RequestBody Host host) {
        hostService.save(host);
        return R.ok();
    }

    /**
     * 删除主机
     * @param id 被删除主机的id
     * @return 返回删除成功/失败信息
     */
    @DeleteMapping("{id}")
    public R delHost(@PathVariable Integer id) {
        hostService.removeById(id);
        return R.ok();
    }

    /**
     * 修改主机信息
     * @param host 主机实体对象
     * @return 返回修改成功/失败信息
     */
    @PutMapping("updateHost")
    public R updateHost(@RequestBody Host host) {
        hostService.updateById(host);
        return R.ok();
    }

    /**
     * 根据id查找主机信息
     * @param id 被查找主机的id
     * @return 返回被查找主机的信息，封装成对象
     */
    @GetMapping("{id}")
    public R getHostById(@PathVariable Integer id) {
        Host host = hostService.getById(id);
        return R.ok().data("host",host);
    }
}

