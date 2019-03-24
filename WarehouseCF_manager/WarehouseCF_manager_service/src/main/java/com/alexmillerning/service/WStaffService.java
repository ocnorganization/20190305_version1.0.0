package com.alexmillerning.service;

import com.alexmillerning.pojo.WStaff;

import java.util.List;
public interface WStaffService {
    /**
     * 查询员工表所有数据
     * @return
     */
    List<WStaff> getWStaffList();

    /**
     * 分页查询员工表
     * @return
     */
    List<WStaff> getWStaffListByPage(String pageSize,String rowSize);

    /**
     * 查询员工表所有数目
     */
    int getWStaffCount();
    /**
     * 按员工编号或者姓名查询员工表
     */
    List<WStaff> getWStaffListByIdorName(String staffId,String staffName);
    /**
     * 新增员工信息
     */
    int addNewStaffData(String staffId,String staffName,String staffGender,String staffPosition,Integer staffPower);
}
