/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service;

import com.alexmillerning.utils.pojo.design.part.PartfTable;

public interface PartService {
    PartfTable getPart(int draw, int currentPage, int pageSize, String searchParam);
    int deletePart(int partId);
    int addPart(String partName, String partDes);
    int editPart(int partId, String partName, String partDes);
    int getPartCount();
}
