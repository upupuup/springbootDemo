package com.demo.springboot.service.impl;

import com.demo.springboot.bean.Department;
import com.demo.springboot.mapper.DepartmentMapper;
import com.demo.springboot.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iDepartmentService")
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    public Department getDeptById(Integer id) {
        return departmentMapper.getDeptById(id);
    }
}
