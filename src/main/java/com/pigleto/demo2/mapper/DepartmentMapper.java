package com.pigleto.demo2.mapper;

import com.pigleto.demo2.entity.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface DepartmentMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    @Insert("insert into Department(departmentName) values(#{departmentName})")
    public void insertDepartment(String departmentName);

    public void deleteDepartment(int id);

    public Department selectDepartmentAll(int id);
}
