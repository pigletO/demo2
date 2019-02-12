package com.pigleto.demo2.mapper;


import com.pigleto.demo2.entity.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {

    @Select("select * from Employee where id=#{id}")
    public Employee selectEmployee(@Param("id") int id);

//    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into Employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{d_id})")
    public void insertEmployee(@Param("lastName") String lastName,@Param("email") String email,@Param("gender") int gender,@Param("d_id") int d_id);
}
