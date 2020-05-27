package com.bs.mstp.mstp01.dao;

import com.bs.mstp.mstp01.bean.Clean;

import java.util.List;

public interface CleanMapper {

    List<Clean> findAll();//查询所有

    Clean findById(long id);//根据id查询

    List<Clean> query(Clean clean);//模糊查询-多条件复合查询-

    void insert(Clean clean);//增加

    void update(Clean clean);//修改

    void deleteById(long id);//删除
}
