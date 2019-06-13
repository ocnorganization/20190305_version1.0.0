/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service;

import com.alexmillerning.utils.pojo.design.brand.BrandfTable;

public interface BrandService {
    BrandfTable getBrand(int draw, int currentPage, int pageSize, String searchParam);
    int getBrandCount();
    int deleteBrand(int brandId);
    int addBrand(String brandName, String brandDes);
    int editBrand(int brandId, String brandName, String brandDes);
}
