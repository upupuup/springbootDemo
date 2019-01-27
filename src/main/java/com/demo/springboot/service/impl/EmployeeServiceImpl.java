package com.demo.springboot.service.impl;

import com.demo.springboot.bean.Employee;
import com.demo.springboot.mapper.EmployeeMapper;
import com.demo.springboot.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iEmployeeService")
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmpById(Integer id) {
        return employeeMapper.getEmpById(id);
    }
}
