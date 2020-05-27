package com.bs.mstp.mstp01.service;

import com.bs.mstp.mstp01.bean.Staff;
import com.bs.mstp.mstp01.bean.extend.StaffExtend;

import java.util.List;

public interface IStaffService {
    List<Staff> findAll();

    Staff findById(long id);

    List<StaffExtend> findAllWithDepartment();

    List<Staff> query(Staff staff);

    void saveOrUpdate(Staff staff) throws Exception;

    void deleteById(long id) throws Exception;

    void batchDelete(long[] ids) throws  Exception;
}
