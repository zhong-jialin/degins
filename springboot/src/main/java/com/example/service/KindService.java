package com.example.service;


import com.example.entity.Kind;
import com.example.mapper.KindMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KindService {

    @Resource
    private KindMapper kindMapper;

    public void add(Kind kind) {
        kindMapper.insert(kind);
    }

    public void deleteById(Integer id) {
        kindMapper.deleteById(id);
    }

    public void deletebatch(List<Integer> ids) {
        for (Integer id : ids){
            kindMapper.deleteById(id);
        }
    }

    public void updateById(Kind kind) {
        kindMapper.updateById(kind);
    }

    public Kind selectById(Integer id) {
        return kindMapper.selectById(id);
    }

    public List<Kind> selectAll(Kind kind) {
        return kindMapper.selectAll(kind);
    }

    public PageInfo<Kind> selectPage(Kind kind, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Kind> list = kindMapper.selectAll(kind);
        return PageInfo.of(list);
    }
}
