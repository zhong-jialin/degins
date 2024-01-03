package com.example.controller;

import com.example.common.Result;
import com.example.entity.CommodityComment;
import com.example.service.CommodityCommentService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("commoditycomment")
public class CommodityCommentController {

    @Resource
    private CommodityCommentService commodityCommentService;

//    新增
    @PostMapping("add")
    public Result add(@RequestBody CommodityComment commodityComment){
        commodityCommentService.add(commodityComment);
        return Result.success();
    }

//
    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        commodityCommentService.deleteById(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        commodityCommentService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result updateById(@RequestBody CommodityComment commodityComment) {
        commodityCommentService.updateById(commodityComment);
        return Result.success();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        CommodityComment commodityComment = commodityCommentService.selectById(id);
        return Result.success(commodityComment);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(CommodityComment commodityComment) {
        List<CommodityComment> list = commodityCommentService.selectAll(commodityComment);
        return Result.success(list);
    }

    @GetMapping("/selectForUser")
    public Result selectForUser(CommodityComment commodityComment) {
        List<CommodityComment> list = commodityCommentService.selectForUser(commodityComment);
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(CommodityComment commodityComment,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<CommodityComment> page = commodityCommentService.selectPage(commodityComment, pageNum, pageSize);
        return Result.success(page);
    }

    @GetMapping("/selectCount")
    public Result selectCount(@RequestParam Integer fid) {
        Integer count = commodityCommentService.selectCount(fid);
        return Result.success(count);
    }
}
