package com.lja.sdn.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lja.sdn.entity.Staticflow;
import com.lja.sdn.result.R;
import com.lja.sdn.service.StaticflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping("/sdn/staticflow")
public class StaticflowController {

    @Autowired
    private StaticflowService staticflowService;

    /**
     * 分页获取静态流表
     * @param current 当前页面
     * @param limit 每页条数
     * @return 返回静态流表的列表
     */
//    @GetMapping("getStaticFlowListPage/{current}/{limit}")
//    public R getStaticFlowListPage(@PathVariable Long current, @PathVariable Long limit) {
//        Page<Staticflow> page = new Page<>(current, limit);
//        staticflowService.page(page,null);
//        List<Staticflow> staticFlowList = page.getRecords();
//        long total = page.getTotal();
//        return R.ok().data("staticFlowList",staticFlowList).data("total",total);
//    }
    @GetMapping("getStaticFlowList")
    public R getStaticFlowListPage() {
        List<Staticflow> staticFlowList = staticflowService.list(null);
        long total = staticFlowList.size();
        return R.ok().data("staticFlowList",staticFlowList).data("total",total);
    }

    /**
     * 添加流表项
     * @param s 字符串类型，流表项内容
     * @return 返回添加结果
     */
    @PostMapping("addStaticFlow")
    public R addStaticFlow(@RequestBody Staticflow s) {
        staticflowService.save(s);
        return R.ok();
    }

    /**
     * 修改流表项
     * @param s 字符串类型，流表项内容
     * @return 返回修改结果
     */
    @PutMapping("updateStaticFlow")
    public R updateStaticFlow(@RequestBody Staticflow s) {
        staticflowService.updateById(s);
        return R.ok();
    }

    /**
     * 删除流表项
     * @param id 流表项id
     * @return 返回删除结果
     */
    @DeleteMapping("{id}")
    public R delStaticFlow(@PathVariable Integer id) {
        staticflowService.removeById(id);
        return R.ok();
    }

    /**
     * 根据流表项id查找流表记录
     * @param id 流表项id
     * @return 返回对应的流表项记录
     */
    @GetMapping("{id}")
    public R getStaticFlowById(@PathVariable Integer id) {
        Staticflow sw = staticflowService.getById(id);
        return R.ok().data("staticFlow",sw);
    }
}

