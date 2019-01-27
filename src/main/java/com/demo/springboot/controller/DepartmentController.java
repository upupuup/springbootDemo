package com.demo.springboot.controller;

import com.demo.springboot.bean.Department;
import com.demo.springboot.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private IDepartmentService iDepartmentService;

    @RequestMapping("/dept/insertDept")
    public int insertDept(Department department) {
        return 1;
    }

    // @RequestMapping("/dept/{id}")
    // @GetMapping("/dept/{id}")
    // public Department getDeptById(@PathVariable(value = "id") Integer id) {
        // return iDepartmentService.getDeptById(id);
    // }
    @RequestMapping("/dept/getDeptById")
    @ResponseBody
    public Department getDeptById(Integer id) {
        System.out.println("进入springboot");
        return iDepartmentService.getDeptById(id);
    }
}
