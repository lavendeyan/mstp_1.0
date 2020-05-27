package com.bs.mstp.mstp01.service.impl;

import com.bs.mstp.mstp01.bean.Clean;
import com.bs.mstp.mstp01.bean.extend.CleanExtend;
import com.bs.mstp.mstp01.dao.CleanMapper;
import com.bs.mstp.mstp01.dao.extend.CleanExtendMapper;
import com.bs.mstp.mstp01.service.ICleanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CleanServiceImpl implements ICleanService {
    
    @Resource
    private CleanMapper cleanMapper;
    @Resource
    private CleanExtendMapper cleanExtendMapper;

    @Override
    public List<Clean> findAll() {
        return cleanMapper.findAll();
    }

    @Override
    public List<CleanExtend> findAllWithGoods() {
        return cleanExtendMapper.findAll();
    }

    @Override
    public Clean findById(long id) {
        return cleanMapper.findById(id);
    }

    @Override
    public List<Clean> query(Clean clean) {
        return cleanMapper.query(clean);
    }

    @Override
    public void saveOrUpdate(Clean clean) throws Exception {

        if(clean.getId() == null){
            cleanMapper.insert(clean);
        }else{
            cleanMapper.update(clean);
        }
        
    }

    @Override
    public void deleteById(long id) throws Exception {

        Clean clean = findById(id);

        if(clean == null){
            throw new Exception("申请不存在，不可删除");
        }else{
            cleanMapper.deleteById(id);
        }
    }

    //    批量删除
    @Override
    public void batchDelete(long[] ids) throws Exception {

        for (long id : ids) {
            cleanMapper.deleteById(id);
        }
    }
}
