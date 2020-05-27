package com.bs.mstp.mstp01.web.controller;


import com.bs.mstp.mstp01.bean.Apply;
import com.bs.mstp.mstp01.bean.extend.ApplyExtend;
import com.bs.mstp.mstp01.service.IApplyService;
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
@RequestMapping("/apply")
public class ApplyController {
    
    @Autowired
    private IApplyService applyService;

    @ApiOperation("查询所有-查询")
    @GetMapping("findAll")
    public Message findAll(){
        List<Apply> list = applyService.findAll();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("查询列表信息时，携带的有申请的物品名称信息-查询")
    @GetMapping("findAllWithGoods")
    public Message findAllWithGoods(){
        List<ApplyExtend> list = applyService.findAllWithGoods();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过id查询所有信息-查询")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键",required = true)
            @RequestParam(value = "id") long id){
        Apply list = applyService.findById(id);
        return MessageUtil.success("success",list);
    }
    @ApiOperation("模糊查询-查询")
    @GetMapping("query")
    public Message query(Apply apply){
        List<Apply> list = applyService.query(apply);
        return MessageUtil.success("success",list);
    }
    @ApiOperation("增改")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Apply apply){
        try{
            applyService.saveOrUpdate(apply);
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
            applyService.deleteById(id);
            return MessageUtil.success("删除成功！");
        }catch (Exception e){
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }

    }

    @PostMapping("batchDelete")
    @ApiOperation("批量删除申请信息")
    public Message batchDelete(@NotNull(message = "ids不能为空") long[] ids) throws Exception{
        applyService.batchDelete(ids);
        return MessageUtil.success("批量删除成功");
    }
}
