package com.bs.mstp.mstp01.web.controller;

import com.bs.mstp.mstp01.bean.Department;
import com.bs.mstp.mstp01.bean.extend.DepartmentExtend;
import com.bs.mstp.mstp01.service.IDepartmentService;

import com.bs.mstp.mstp01.utils.Message;
import com.bs.mstp.mstp01.utils.MessageUtil;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated //参数校验
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @ApiOperation("查询所有-查询")
    @GetMapping("findAll")
    public Message findAll(){
        List<Department> list = departmentService.findAll();
        return MessageUtil.success("success",list);
    }

    @ApiParam("查询科室信息时，携带的有员工信息-查询")
    @GetMapping("findAllWithStaff")
    public Message findAllWithStaff(){
        List<DepartmentExtend> list = departmentService.findAllWithStaff();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("通过id查询所有信息-查询")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键",required = true)
            @RequestParam(value = "id") long id){
        Department list = departmentService.findById(id);
        return MessageUtil.success("success",list);
    }

    @ApiOperation("模糊查询-查询")
    @GetMapping("query")
    public Message query(Department department){
        List<Department> list = departmentService.query(department);
        return MessageUtil.success("success",list);
    }

    @ApiOperation("增改")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Department department){
        try{
            departmentService.saveOrUpdate(department);
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
            departmentService.deleteById(id);
            return MessageUtil.success("删除成功！");
        }catch (Exception e){
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }

    }

    @PostMapping("batchDelete")
    @ApiOperation("批量删除科室信息")
    public Message batchDelete(@NotNull(message = "ids不能为空") long[] ids) throws Exception{
        departmentService.batchDelete(ids);
        return MessageUtil.success("批量删除成功");
    }


}
