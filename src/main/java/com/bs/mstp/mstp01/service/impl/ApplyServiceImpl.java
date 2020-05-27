package com.bs.mstp.mstp01.service.impl;

import com.bs.mstp.mstp01.bean.Apply;
import com.bs.mstp.mstp01.bean.extend.ApplyExtend;
import com.bs.mstp.mstp01.dao.ApplyMapper;
import com.bs.mstp.mstp01.dao.extend.ApplyExtendMapper;
import com.bs.mstp.mstp01.service.IApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplyServiceImpl implements IApplyService {

    @Resource
    private ApplyMapper applyMapper;
    @Resource
    private ApplyExtendMapper applyExtendMapper;

    @Override
    public List<ApplyExtend> findAllWithGoods() {
        return applyExtendMapper.findAll();
    }

    @Override
    public List<Apply> findAll() {
        return applyMapper.findAll();
    }

    @Override
    public Apply findById(long id) {
        return applyMapper.findById(id);
    }

    @Override
    public List<Apply> query(Apply apply) {
        return applyMapper.query(apply);
    }

    @Override
    public void saveOrUpdate(Apply apply) throws Exception {

        if(apply.getId() == null){
            applyMapper.insert(apply);
        }else{
            applyMapper.update(apply);
        }
        
    }

    @Override
    public void deleteById(long id) throws Exception {

        Apply apply = findById(id);

        if(apply == null){
            throw new Exception("申请不存在，不可删除");
        }else{
            applyMapper.deleteById(id);
        }
        
    }

    //    批量删除
    @Override
    public void batchDelete(long[] ids) throws Exception {

        for (long id : ids) {
            applyMapper.deleteById(id);
        }
    }
}
