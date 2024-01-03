package com.example.controller;

import com.example.common.Result;
import com.example.entity.Kind;
import com.example.service.KindService;
import com.github.pagehelper.PageInfo;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/kind")
public class KindController {

    @Resource
    private KindService kindService;

    @PostMapping("/add")
    public Result add(@RequestBody Kind kind){
        kindService.add(kind);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id){
        kindService.deleteById(id);
        return Result.success();
    }

    @DeleteMapping("/delete/batch")
    public Result deletebatch(@RequestBody List<Integer> ids){
        kindService.deletebatch(ids);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Kind kind){
        kindService.updateById(kind);
        return Result.success();
    }

    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id){
        Kind kind = kindService.selectById(id);
        return Result.success(kind);
    }

    @GetMapping("/selectAll")
    public Result selectAll(Kind kind){
        List<Kind> kingList = kindService.selectAll(kind);
        return Result.success(kingList);
    }

    @GetMapping("/selctPage")
    public Result selectPage(Kind kind,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize){
        PageInfo<Kind> pageInfo = kindService.selectPage(kind,pageNum,pageSize);
        return Result.success(pageInfo);
    }

}
