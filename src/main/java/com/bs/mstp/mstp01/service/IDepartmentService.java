package com.bs.mstp.mstp01.service;

import com.bs.mstp.mstp01.bean.Department;
import com.bs.mstp.mstp01.bean.extend.DepartmentExtend;

import java.util.List;

public interface IDepartmentService {

    List<Department> findAll();

    List<DepartmentExtend> findAllWithStaff();

    Department findById(long id);

    List<Department> query(Department department);

    void saveOrUpdate(Department department) throws Exception;

    void deleteById(long id) throws Exception;

    void batchDelete(long[] ids) throws  Exception;
}
