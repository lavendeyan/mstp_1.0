package com.bs.mstp.mstp01.web.controller;


import com.bs.mstp.mstp01.bean.Goods;
import com.bs.mstp.mstp01.service.impl.GoodsServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.bs.mstp.mstp01.utils.Message;
import com.bs.mstp.mstp01.utils.MessageUtil;

import javax.validation.constraints.NotNull;
import java.util.List;
@Validated //参数校验
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsService;

    @ApiOperation("查询所有，用于显示所有列表信息-查询")
    @GetMapping("findAll")
    public Message findAll(){
        List<Goods> list = goodsService.findAll();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过id查询所有信息-查询")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键",required = true)
            @RequestParam(value = "id") long id){
        Goods list = goodsService.findById(id);
        return MessageUtil.success("success",list);
    }

    @ApiOperation("查询id和name，供下拉列表使用-查询")
    @GetMapping("findIdAndName")
    public Message findIdAndName(){
        List<Goods> list = goodsService.findIdAndName();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("模糊查询-查询")
    @GetMapping("query")
    public Message query(Goods goods){
        List<Goods> list = goodsService.query(goods);
        return MessageUtil.success("success",list);
    }

    @ApiOperation("增改")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Goods goods){
        try{
            goodsService.saveOrUpdate(goods);
            return MessageUtil.success("保存成功！");
        } catch(Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("通过id删除-删除")
    @GetMapping("deleteById")
    public Message deleteById(@ApiParam(required = true) @RequestParam("id") long id){
        try{
            goodsService.deleteById(id);
            return MessageUtil.success("删除成功！");
        }catch (Exception e){
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }

    }

    @PostMapping("batchDelete")
    @ApiOperation("批量删除物品信息")
    public Message batchDelete(@NotNull(message = "ids不能为空") long[] ids) throws Exception{
        goodsService.batchDelete(ids);
        return MessageUtil.success("批量删除成功");
    }
}
