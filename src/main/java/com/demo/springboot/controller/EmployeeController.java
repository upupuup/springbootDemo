package com.demo.springboot.controller;

import com.demo.springboot.bean.Employee;
import com.demo.springboot.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        Employee empById = iEmployeeService.getEmpById(id);
        return empById;
    }
}
