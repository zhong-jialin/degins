package com.example.mapper;

import com.example.entity.CommodityComment;

import java.util.List;

public interface CommodityCommentMapper {
    void insert(CommodityComment commodityComment);

    void deleteById(Integer id);

    void updateById(CommodityComment commodityComment);

    CommodityComment selectById(Integer id);

    List<CommodityComment> selectAll(CommodityComment commodityComment);

    List<CommodityComment> selectForUser(CommodityComment commodityComment);

    Integer selectCount(Integer fid);


}
