package com.bs.mstp.mstp01.dao;

import com.bs.mstp.mstp01.bean.Staff;

import java.util.List;

public interface StaffMapper {

    //private Long id;
    //    private String name;
    //    private Long def_id;
    //    private String duty;
    //    private String grade;
    //    private String age;
    //    private String sex;
    //    private String detail;
    //    private String address;

    List<Staff> findAll();//查询所有

    Staff findById(long id);//根据id查询

    List<Staff> query(Staff staff);//模糊查询-多条件复合查询-

    void insert(Staff staff);//增加

    void update(Staff staff);//修改

    void deleteById(long id);//删除
}
