/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service;

import com.alexmillerning.utils.pojo.design.unit.UnitfTable;

public interface UnitService {
    UnitfTable getUnit(int draw, int currentPage, int pageSize, String searchParam);
    int deleteUnit(int unitId);
    int addUnit(String unitName, String unitDes);
    int editUnit(int unitId, String unitName, String unitDes);
    int getUnitCount();
}
