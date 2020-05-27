package com.bs.mstp.mstp01.dao;

import com.bs.mstp.mstp01.bean.Apply;

import java.util.List;

public interface ApplyMapper {

    List<Apply> findAll();//查询所有

    Apply findById(long id);//根据id查询

    List<Apply> query(Apply apply);//模糊查询-多条件复合查询-

    void insert(Apply apply);//增加

    void update(Apply apply);//修改

    void deleteById(long id);//删除
}
