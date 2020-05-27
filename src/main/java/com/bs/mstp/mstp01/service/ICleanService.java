package com.bs.mstp.mstp01.service;

import com.bs.mstp.mstp01.bean.Clean;
import com.bs.mstp.mstp01.bean.extend.CleanExtend;

import java.util.List;

public interface ICleanService {

    List<Clean> findAll();

    List<CleanExtend> findAllWithGoods();

    Clean findById(long id);

    List<Clean> query(Clean clean);

    void saveOrUpdate(Clean clean) throws Exception;

    void deleteById(long id) throws Exception;
    void batchDelete(long[] ids) throws  Exception;
}
