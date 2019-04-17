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

public interface WFColorBranchService {
    List<WFColorBranch> getColorBranch();
    List<WFColorBranch> getColorBranch(String colorId,Integer offSet,Integer limit);
    List<WFColorBranch> getColorBranchbyPage(Integer offSet,Integer limit);
    int getColorBranchCount();
    int getColorBranchCountbyPid(String colorId);
    int updateColorBranch(WFColorBranch wfColorBranch);
    List<WFColorBranch> searchColorBranch(String searchParam,Integer offSet,Integer limit);

}
