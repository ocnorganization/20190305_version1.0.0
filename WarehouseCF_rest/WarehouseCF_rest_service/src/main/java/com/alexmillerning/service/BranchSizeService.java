/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service;

import com.alexmillerning.utils.pojo.design.size.BranchSizefTable;

public interface BranchSizeService {
    BranchSizefTable getBranchSize(String sizePid, int draw, int currentPage, int pageSize, String searchParam);
    int getBranchSizeCount();
    int getBranchSizeCountbyPid(String sizePid);
    int deleteBranchSizeById(int Id);
    int addBranchSize(int sizePid, String branchSizeName);
    int editBranchSize(int branchSizeId, String branchSizeName, String sizeName);
}
