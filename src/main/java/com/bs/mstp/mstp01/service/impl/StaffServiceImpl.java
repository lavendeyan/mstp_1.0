package com.bs.mstp.mstp01.service.impl;

import com.bs.mstp.mstp01.bean.Staff;
import com.bs.mstp.mstp01.bean.extend.StaffExtend;
import com.bs.mstp.mstp01.dao.StaffMapper;
import com.bs.mstp.mstp01.dao.extend.StaffExtendMapper;
import com.bs.mstp.mstp01.service.IStaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffServiceImpl implements IStaffService {

    @Resource
    private StaffMapper staffMapper;
    @Resource
    private StaffExtendMapper staffExtendMapper;

    @Override
    public List<Staff> findAll() {
        return staffMapper.findAll();
    }

    @Override
    public Staff findById(long id) {
        return staffMapper.findById(id);
    }

    @Override
    public List<StaffExtend> findAllWithDepartment() {
        return staffExtendMapper.findAll();
    }

    @Override
    public List<Staff> query(Staff staff) {
        return staffMapper.query(staff);
    }

    @Override
    public void saveOrUpdate(Staff staff) throws Exception {
        if(staff.getId() == null){
            staffMapper.insert(staff);
        }else{
            staffMapper.update(staff);
        }
    }

    @Override
    public void deleteById(long id) throws Exception {
        Staff staff = findById(id);
        if(staff == null){
            throw new Exception("职工不存在，不可删除");
        }else{
            staffMapper.deleteById(id);
        }
    }

    //    批量删除
    @Override
    public void batchDelete(long[] ids) throws Exception {

        for (long id : ids) {
            staffMapper.deleteById(id);
        }
    }
}
