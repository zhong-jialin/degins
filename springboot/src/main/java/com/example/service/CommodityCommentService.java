package com.example.service;

import cn.hutool.core.date.DateUtil;
import com.example.common.enums.RoleEnum;
import com.example.entity.Account;
import com.example.entity.Comment;
import com.example.entity.CommodityComment;
import com.example.mapper.CommodityCommentMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommodityCommentService {

    @Resource
    private CommodityCommentMapper commodityCommentMapper;



    public void add(CommodityComment commodityComment) {
        Account currentUser = TokenUtils.getCurrentUser();
        if (RoleEnum.USER.name().equals(currentUser.getRole())){
            commodityComment.setUserId(currentUser.getId());
        }
        commodityComment.setCtime(DateUtil.now());
        commodityCommentMapper.insert(commodityComment);
        if (commodityComment.getRootId() == null) {
            commodityComment.setRootId(commodityComment.getId());
            commodityCommentMapper.updateById(commodityComment); // 注意 更新一下 root_id
        }
    }

    public void deleteById(Integer id) {
        commodityCommentMapper.deleteById(id);
    }

    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            commodityCommentMapper.deleteById(id);
        }
    }

    public void updateById(CommodityComment commodityComment) {
        commodityCommentMapper.updateById(commodityComment);
    }

    public CommodityComment selectById(Integer id) {
        return commodityCommentMapper.selectById(id);
    }

    public List<CommodityComment> selectAll(CommodityComment commodityComment) {
        return commodityCommentMapper.selectAll(commodityComment);
    }

    public List<CommodityComment> selectForUser(CommodityComment commodityComment) {
        List<CommodityComment> commentList = commodityCommentMapper.selectForUser(commodityComment);  // 查询一级的评论
        for (CommodityComment c : commentList) {  // 查询回复列表
            CommodityComment param = new CommodityComment();
            param.setRootId(c.getId());
            List<CommodityComment> children = this.selectAll(param);
            children = children.stream().filter(child -> !child.getId().equals(c.getId())).collect(Collectors.toList());  // 排除当前查询结果里最外层节点
            c.setChildren(children);
        }
        return commentList;
    }

    public PageInfo<CommodityComment> selectPage(CommodityComment commodityComment, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<CommodityComment> list =  commodityCommentMapper.selectAll(commodityComment);
        return PageInfo.of(list);
    }

    public Integer selectCount(Integer fid) {
        return commodityCommentMapper.selectCount(fid);
    }
}
