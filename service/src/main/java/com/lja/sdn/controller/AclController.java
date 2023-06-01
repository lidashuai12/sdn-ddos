package com.lja.sdn.controller;


import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lja
 * @since 2023-05-23
 */
@RestController
@RequestMapping("/sdn/acl")
public class AclController {
/*
    @Autowired
    private AclService aclService;

    @GetMapping("listAcl")
    public R listAcl() {
        return R.ok().data("aclList", aclService.list(null));
    }

    @GetMapping("getListAclPage/{current}/{limit}")
    public R getListAclPage(@PathVariable Long current, @PathVariable Long limit) {
        Page<Acl> page = new Page<>(current, limit);
        aclService.page(page, null);
        List<Acl> records = page.getRecords();
        long total = page.getTotal();
        return R.ok().data("aclList", records).data("total", total);
    }

    @PostMapping("addAcl")
    public R addAcl(@RequestBody Acl acl) {
        aclService.save(acl);
        return R.ok().message("add acl success");
    }

    @DeleteMapping("{id}")
    public R deleteAcl(@PathVariable Long id) {
        aclService.removeById(id);
        return R.ok().message("delete acl success");
    }*/
}

