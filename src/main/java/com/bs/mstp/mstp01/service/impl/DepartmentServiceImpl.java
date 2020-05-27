package com.bs.mstp.mstp01.service.impl;

import com.bs.mstp.mstp01.bean.Department;
import com.bs.mstp.mstp01.bean.extend.DepartmentExtend;
import com.bs.mstp.mstp01.dao.DepartmentMapper;
import com.bs.mstp.mstp01.dao.extend.DepartmentExtendMapper;
import com.bs.mstp.mstp01.service.IDepartmentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private DepartmentExtendMapper departmentExtendMapper;

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll(); }

    @Override
    public List<DepartmentExtend> findAllWithStaff() {
        return departmentExtendMapper.findAll(); }

    @Override
    public Department findById(long id) {
        return departmentMapper.findById(id);
    }

    @Override
    public List<Department> query(Department department) {
        return departmentMapper.query(department);
    }

    @Override
    public void saveOrUpdate(Department department) throws Exception {
        if(department.getId() == null){
            departmentMapper.insert(department);
        }else{
            departmentMapper.update(department);
        }
    }

    @Override
    public void deleteById(long id) throws Exception {
        Department department = findById(id);
        if(department == null){
            throw new Exception("科室不存在，不可删除");
        }else{
            departmentMapper.deleteById(id);
        }
    }

//    批量删除
    @Override
    public void batchDelete(long[] ids) throws Exception {

        for (long id : ids) {
            departmentMapper.deleteById(id);
        }
    }
}
