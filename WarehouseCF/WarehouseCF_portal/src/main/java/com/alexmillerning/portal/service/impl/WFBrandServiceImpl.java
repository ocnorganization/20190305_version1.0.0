/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.service.impl;

import com.alexmillerning.mapper.WFBrandMapper;
import com.alexmillerning.pojo.WFBrand;
import com.alexmillerning.pojo.WFBrandExample;
import com.alexmillerning.portal.service.WFBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WFBrandServiceImpl implements WFBrandService {
    @Autowired
    WFBrandMapper wfBrandMapper;
    @Override
    public List<WFBrand> getBrand(Integer offSet, Integer limit) {
        WFBrandExample wfBrandExample = new WFBrandExample();
        wfBrandExample.setLimit(limit);
        wfBrandExample.setOffset(offSet);
        List<WFBrand> wfBrandList = wfBrandMapper.selectByExampleandPage(wfBrandExample);
        return wfBrandList;
    }

    @Override
    public int getBrandCount() {
        WFBrandExample wfBrandExample = new WFBrandExample();
        int count = wfBrandMapper.countByExample(wfBrandExample);
        return count;
    }

    @Override
    public int updateBrand(WFBrand wfBrand) {
        WFBrandExample wfBrandExample = new WFBrandExample();
        WFBrandExample.Criteria criteria = wfBrandExample.createCriteria();
        criteria.andBrandIdEqualTo(wfBrand.getBrandId());
        return wfBrandMapper.updateByExampleSelective(wfBrand,wfBrandExample);
    }

    @Override
    public int deleteBrandbyId(Integer brandId) {
        return wfBrandMapper.deleteByPrimaryKey(brandId);
    }
}
