package com.bs.mstp.mstp01.service;

import com.bs.mstp.mstp01.bean.Apply;
import com.bs.mstp.mstp01.bean.extend.ApplyExtend;

import java.util.List;

public interface IApplyService {

    List<Apply> findAll();

    List<ApplyExtend> findAllWithGoods();


    Apply findById(long id);

    List<Apply> query(Apply apply);

    void saveOrUpdate(Apply apply) throws Exception;

    void deleteById(long id) throws Exception;
    void batchDelete(long[] ids) throws  Exception;
}
