package com.bs.mstp.mstp01.service;

import com.bs.mstp.mstp01.bean.Goods;

import java.util.List;

public interface IGoodsService {

    List<Goods> findAll();//查询所有

    Goods findById(long id);//根据id查询

    List<Goods> findIdAndName();//查询-查询id和name，供下拉列表使用

    List<Goods> query(Goods goods);//模糊查询-多条件复合查询-

    void saveOrUpdate(Goods goods) throws Exception;

    void deleteById(long id) throws Exception;
    void batchDelete(long[] ids) throws  Exception;
}
