package com.alexmillerning.controller;

import com.alexmillerning.pojo.WStaff;
import com.alexmillerning.service.WStaffService;
import com.alexmillerning.utils.EasyuiUtils;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Controller
/**
 * @name mEmployeeController
 * @author Alex
 * @date 2019/3/22
 * @description 员工数据相关的页面控制代码
 */
public class mEmployeeController {
    final Logger logger = Logger.getLogger(mEmployeeController.class);
    //新增员工权限页面
    @RequestMapping("/index/getMenus/addEmployeePower")
    public String  requestAddEmployeePower(){
        return "manageEmployee/power/addEmployee";
    }
    //修改员工权限页面
    @RequestMapping("/index/getMenus/updateEmployeePower")
    public String  requestUpdateEmployeePower(){
        return "manageEmployee/power/updateEmployee";
    }
    //新增员工信息页面
    @RequestMapping("/index/getMenus/addEmployeeData")
    public String  requestAddEmployeeData(){
        return "manageEmployee/data/addEmployeeData";
    }
    //查询员工信息页面
    @RequestMapping("/index/getMenus/loadEmployeeData")
    public String  requestLoadEmployeeData(){
        return "manageEmployee/data/loadEmployee";
    }

    @Autowired
    WStaffService wStaffService;
    @RequestMapping("/index/getMenus/loadEmployeeData/getTableData")
    @ResponseBody
    /**
     * @methodname getEmployeeTableData
     * @author Alex
     * @date 2019/3/22
     * @param []
     * @return java.util.List<com.alexmillerning.pojo.WStaff>
     * @description 查询全部员工信息页面
     */
    public List<WStaff>  getEmployeeTableData(){
        List<WStaff> wStaffList = wStaffService.getWStaffList();
        return wStaffList;
    }
    @RequestMapping("/index/getMenus/loadEmployeeData/getTableDataByPage")
    @ResponseBody
    /**
     * @methodname getEmployeeTableDataByPage
     * @author Alex
     * @date 2019/3/22
     * @param [pageSize, rowSize, staffId, staffName]
     * @return com.alibaba.fastjson.JSONObject
     * @description 分页查询员工信息页面
     */
    public JSONObject getEmployeeTableDataByPage(@RequestParam(value="page") String pageSize, @RequestParam(value="rows") String rowSize, @RequestParam(value="staffId") String staffId,@RequestParam(value="staffName") String staffName){
        if(logger.isDebugEnabled()){
            logger.debug("页面[/index/getMenus/loadEmployeeData/getTableDataByPage]请求参数: page["+pageSize+"] rows["+rowSize+"] staffId["+staffId+"] staffName["+staffName+"]");
        }
        if(staffId !=null||staffName != null){
            if(staffId.equals("")&&staffName.equals("")){
                List<WStaff> wStaffList = wStaffService.getWStaffListByPage(pageSize,rowSize);
                int size = wStaffService.getWStaffCount();
                JSONObject jsonObject = EasyuiUtils.generateJSONObj(wStaffList,size);
                return jsonObject;
            }else{
                List<WStaff> wStaffList = wStaffService.getWStaffListByIdorName(staffId,staffName);
                JSONObject jsonObject = EasyuiUtils.generateJSONObj(wStaffList,wStaffList.size());
                return jsonObject;
            }
        }
        return null;
     }
    //新增员工信息提交页面
    @RequestMapping("/index/getMenus/addEmployeeData/addForm")
    public void requestAddEmployeeDataAddForm(@RequestParam(value = "staffId") String staffId,@RequestParam(value = "staffName") String staffName,@RequestParam(value = "staffGender") String staffGender,@RequestParam(value = "staffPosition") String staffPosition,@RequestParam(value = "staffPower") String staffPower){
        if(logger.isDebugEnabled()){
            logger.debug("页面[/index/getMenus/addEmployeeData/addForm]请求参数: staffId["+staffId+"] staffName["+staffName+"]");
        }
        wStaffService.addNewStaffData(staffId,staffName,staffGender,staffPosition,Integer.parseInt(staffPower));
    }
}
