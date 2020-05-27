package com.bs.mstp.mstp01.web.controller;

import com.bs.mstp.mstp01.bean.Staff;
import com.bs.mstp.mstp01.bean.extend.StaffExtend;
import com.bs.mstp.mstp01.service.IStaffService;
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
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private IStaffService staffService;

    @ApiOperation("查询所有-查询")
    @GetMapping("findAll")
    public Message findAll(){

        List<Staff> list = staffService.findAll();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("通过id查询所有信息-查询")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键",required = true)
            @RequestParam(value = "id") long id){

        Staff list = staffService.findById(id);

        return MessageUtil.success("success",list);
    }

    @ApiOperation("模糊查询-查询")
    @GetMapping("query")
    public Message query(Staff staff){

        List<Staff> list = staffService.query(staff);

        return MessageUtil.success("success",list);
    }

    @ApiParam("查询职员信息时，携带的有科室信息-查询")
    @GetMapping("findAllWithDepartment")
    public Message findAllWithDepartment(){
        List<StaffExtend> list = staffService.findAllWithDepartment();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("增改")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Staff staff){
        try{
            staffService.saveOrUpdate(staff);
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
            staffService.deleteById(id);
            return MessageUtil.success("删除成功！");
        }catch (Exception e){
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }

    }

    @PostMapping("batchDelete")
    @ApiOperation("批量删除顾客信息")
    public Message batchDelete(@NotNull(message = "ids不能为空") long[] ids) throws Exception{
        staffService.batchDelete(ids);
        return MessageUtil.success("批量删除成功");
    }
}
