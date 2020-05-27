package com.bs.mstp.mstp01.dao;

import com.bs.mstp.mstp01.bean.Department;

import java.util.List;

public interface DepartmentMapper {

    /**
     * private Long id;
     *     private String name;
     *     private String director;
     *     private String address;
     *     private String tel;
     *     private Date foundtime;
     * */
    List<Department> findAll();//查询所有

    Department findById(long id);//根据id查询

    List<Department> query(Department department);//模糊查询-多条件复合查询-

    void insert(Department department);//增加

    void update(Department department);//修改

    void deleteById(long id);//删除

}
