package com.pigleto.demo2.controller;

import com.pigleto.demo2.entity.Department;
import com.pigleto.demo2.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/insertDepartment")
    public Department insertDepartment(Department department){

        departmentMapper.insertDepartment(department.getDepartmentName());
        System.out.println(department);
        return department;
    }

    @GetMapping("/deleteDepartment/{id}")
    public void deleteDepartment(@PathVariable("id") int id){
        departmentMapper.deleteDepartment(id);
    }

    @GetMapping("/selectDepartment/{id}")
    public Department selectDepartment(@PathVariable("id") int id){
        return departmentMapper.selectDepartmentAll(id);
    }
}
