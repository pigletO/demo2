package com.pigleto.demo2.controller;

import com.pigleto.demo2.entity.Employee;
import com.pigleto.demo2.mapper.EmployeeMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/insert")
    public void insertEmployee(Employee employee){

        employeeMapper.insertEmployee(employee.getLastName(),employee.getEmail(),employee.getGender(),employee.getD_id());
    }

    @GetMapping("/select/{id}")
    public Employee selectEmployee(@PathVariable("id") int id){

        Employee s = employeeMapper.selectEmployee(id);
        System.err.println(s);

        return  s;
    }

}
