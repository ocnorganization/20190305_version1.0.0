/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service;


import com.alexmillerning.pojo.WFBrand;

import java.util.List;

public interface WFBrandService {
    List<WFBrand> getBrand(Integer offSet, Integer limit);
   //获取品牌总数
    int getBrandCount();
    //修改品牌数据
    int updateBrand(WFBrand wfBrand);
    //删除品牌数据
    int deleteBrandbyId(Integer brandId);

}

