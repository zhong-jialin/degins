package com.example.mapper;

import com.example.entity.Kind;

import java.util.List;

public interface KindMapper {
    void insert(Kind kind);

    void deleteById(Integer id);

    void updateById(Kind kind);

    Kind selectById(Integer id);

    List<Kind> selectAll(Kind kind);

}
