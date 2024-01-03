package com.example.controller;


import com.example.entity.Commoodity;
import com.github.pagehelper.PageInfo;
import com.example.common.Result;
import com.example.service.CommoodityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/commodity")
public class CommoodityController {
    @Resource
    private CommoodityService commoodityService;

    /**
     * 新增
     */
    @PostMapping("/add")
    public Result add(@RequestBody Commoodity commoodity) {
        commoodityService.add(commoodity);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        commoodityService.deleteById(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        commoodityService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result updateById(@RequestBody Commoodity commoodity) {
        commoodityService.updateById(commoodity);
        return Result.success();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        Commoodity commoodity = commoodityService.selectById(id);
        return Result.success(commoodity);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(Commoodity commoodity) {
        List<Commoodity> list = commoodityService.selectAll(commoodity);
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(Commoodity commoodity,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Commoodity> page = commoodityService.selectPage(commoodity, pageNum, pageSize);
        return Result.success(page);
    }
}
