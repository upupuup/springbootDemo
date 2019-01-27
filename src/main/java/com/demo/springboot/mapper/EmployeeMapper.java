package com.demo.springboot.mapper;

import com.demo.springboot.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
}
