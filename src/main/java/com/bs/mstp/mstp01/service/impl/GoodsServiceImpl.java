package com.bs.mstp.mstp01.service.impl;

import com.bs.mstp.mstp01.bean.Goods;
import com.bs.mstp.mstp01.dao.GoodsMapper;
import com.bs.mstp.mstp01.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {


    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }

    @Override
    public Goods findById(long id) {
        return goodsMapper.findById(id);
    }

    @Override
    public List<Goods> findIdAndName() {
        return goodsMapper.findIdAndName();
    }

    @Override
    public List<Goods> query(Goods goods) {
        return goodsMapper.query(goods);
    }

    @Override
    public void saveOrUpdate(Goods goods) throws Exception {

        if(goods.getId() == null){
            goodsMapper.insert(goods);
        }else{
            goodsMapper.update(goods);
        }

    }

    @Override
    public void deleteById(long id) throws Exception {

        Goods goods = findById(id);
        if(goods == null){
            throw new Exception("物品不存在，不可删除");
        }else{
            goodsMapper.deleteById(id);
        }
    }

    //    批量删除
    @Override
    public void batchDelete(long[] ids) throws Exception {

        for (long id : ids) {
            goodsMapper.deleteById(id);
        }
    }
}
