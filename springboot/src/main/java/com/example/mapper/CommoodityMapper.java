package com.example.mapper;


import com.example.entity.Commoodity;

import java.util.List;


public interface CommoodityMapper {


    void insert(Commoodity commoodity);

    void deleteById(Integer id);

    void updateById(Commoodity commoodity);

    Commoodity selectById(Integer id);

    List<Commoodity> selectAll(Commoodity commoodity);
}
