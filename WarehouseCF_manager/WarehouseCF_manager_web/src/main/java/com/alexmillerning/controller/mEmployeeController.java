package com.alexmillerning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mEmployeeController {
    //新增员工权限
    @RequestMapping("/index/getMenus/addNewEmployee")
    public String  requestAddEmployeePower(){
        return "manageEmployee/power/addEmployee";
    }
    //修改员工权限
    @RequestMapping("/index/getMenus/addUpdateEmployee")
    public String  requestUpdateEmployeePower(){
        return "manageEmployee/power/addEmployee";
    }
}
