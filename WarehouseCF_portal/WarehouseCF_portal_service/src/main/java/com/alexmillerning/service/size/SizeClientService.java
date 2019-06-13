/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service.size;


import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.size.BranchSizefTable;
import com.alexmillerning.utils.pojo.design.size.SizefDrop;

public interface SizeClientService {
    SizefDrop getBasicSizefDrop();
    BranchSizefTable getBranchSizefTable(String jsonParam);
    MessageToInterface deleteBranchSizefTable(String jsonParam);
    MessageToInterface addBranchSizefTable(String jsonParam);
    MessageToInterface editBranchSizefTable(String jsonParam);
}
