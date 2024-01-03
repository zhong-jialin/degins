package com.example.service;

import com.example.entity.Commoodity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.mapper.CommoodityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CommoodityService {
    @Resource
    private CommoodityMapper commodityMapper;


    public void add(Commoodity commoodity) {
        commodityMapper.insert(commoodity);
    }

    public void deleteById(Integer id) {
        commodityMapper.deleteById(id);
    }

    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            commodityMapper.deleteById(id);
        }
    }

    public void updateById(Commoodity commoodity) {
        commodityMapper.updateById(commoodity);
    }

    public Commoodity selectById(Integer id) {
        return commodityMapper.selectById(id);
    }

    public List<Commoodity> selectAll(Commoodity commoodity) {
        return commodityMapper.selectAll(commoodity);
    }

    public PageInfo<Commoodity> selectPage(Commoodity commoodity, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Commoodity> list = commodityMapper.selectAll(commoodity);
        return PageInfo.of(list);
    }
}
