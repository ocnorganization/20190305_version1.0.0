/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.service;

import com.alexmillerning.pojo.WFColorBranch;

import java.util.List;

/**
 * @name WFColorBranchService
 * @author Alex
 * @date 2019/4/18
 * @description 颜色子类数据库查询接口
 */
public interface WFColorBranchService {
    List<WFColorBranch> getColorBranch();
    //根据父类颜色id分页查询
    List<WFColorBranch> getColorBranch(String colorId,Integer offSet,Integer limit);
    //分页查询
    List<WFColorBranch> getColorBranchbyPage(Integer offSet,Integer limit);
    //查询子类颜色数量
    int getColorBranchCount();
    //按父类颜色id查询数量
    int getColorBranchCountbyPid(String colorId);
    //通过子类颜色id更新数据
    int updateColorBranch(WFColorBranch wfColorBranch);
    //通过条件搜索子类颜色信息
    List<WFColorBranch> searchColorBranch(String searchParam,Integer offSet,Integer limit);
    //通过子类颜色id删除颜色信息
    int deleteColorBranchbyId(Integer colorBranchId);

}
