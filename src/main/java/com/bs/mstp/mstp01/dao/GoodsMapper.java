package com.bs.mstp.mstp01.dao;

import com.bs.mstp.mstp01.bean.Goods;
import com.bs.mstp.mstp01.bean.Staff;

import java.util.List;

public interface GoodsMapper {

//    private Long id;
//    private String name;
//    private String barcode;
//    private String norm;
//    private String unit;
//    private String num;
//    private String boxnorm;
//    private String brithtime;

    List<Goods> findAll();//查询所有

    Goods findById(long id);//查询-根据id查询

    List<Goods> findIdAndName();//查询-查询id和name，供下拉列表使用

    List<Goods> query(Goods goods);//模糊查询-多条件复合查询-

    void insert(Goods goods);//增加

    void update(Goods goods);//修改

    void deleteById(long id);//删除

}
