/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFBrandMapper;
import com.alexmillerning.pojo.WFBrand;
import com.alexmillerning.pojo.WFBrandExample;
import com.alexmillerning.service.BrandService;
import com.alexmillerning.utils.ResultToBrandTable;
import com.alexmillerning.utils.pojo.design.brand.BrandfTable;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class BrandServiceImpl implements BrandService {
    static final Logger logger = Logger.getLogger(BrandServiceImpl.class);
    @Autowired
    WFBrandMapper wfBrandMapper;

    /**
     * @description 查询品牌详情
     * @param draw
     * @param currentPage
     * @param pageSize
     * @param searchParam
     * @return
     */
    @Override
    public BrandfTable getBrand(int draw, int currentPage, int pageSize, String searchParam) {
        WFBrandExample wfBrandExample = new WFBrandExample();
        WFBrandExample.Criteria criteria = wfBrandExample.createCriteria();
        if(null != searchParam&&!("".equals(searchParam))){
            Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
            if(pattern.matcher(searchParam).matches()) {
                if (logger.isDebugEnabled()) {
                    logger.debug("查询参数匹配为数字[" + searchParam + "],根据品牌ID查询品牌信息");
                }
                criteria.andBrandIdEqualTo(Integer.parseInt(searchParam));
                List<WFBrand> wfBrandList = wfBrandMapper.selectByExample(wfBrandExample);
                int recordsTotal = wfBrandList.size();
                int recordsFiltered = wfBrandList.size();
                return ResultToBrandTable.convert(wfBrandList, draw, recordsTotal, recordsFiltered);
            }else {
                if (logger.isDebugEnabled()) {
                    logger.debug("查询参数匹配为字符串[" + searchParam + "],根据品牌名称查询品牌信息");
                }
                criteria.andBrandNameEqualTo(searchParam);
                List<WFBrand> wfBrandList = wfBrandMapper.selectByExample(wfBrandExample);
                int recordsTotal = wfBrandList.size();
                int recordsFiltered = wfBrandList.size();
                return ResultToBrandTable.convert(wfBrandList, draw, recordsTotal, recordsFiltered);
            }
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("分页查询品牌");
            }
            int recordsTotal = getBrandCount();
            int  recordsFiltered = getBrandCount();
            PageHelper.startPage(currentPage, pageSize);
            List<WFBrand> wfBrandList = wfBrandMapper.selectByExample(wfBrandExample);
            return ResultToBrandTable.convert(wfBrandList, draw, recordsTotal, recordsFiltered);
        }
    }

    /**
     * @description 查询品牌数量
     * @return
     */
    @Override
    public int getBrandCount() {
        WFBrandExample wfBrandExample = new WFBrandExample();
        return wfBrandMapper.countByExample(wfBrandExample);
    }

    /**
     * 删除品牌
     * @param brandId
     * @return
     */
    @Override
    public int deleteBrand(int brandId) {
        return wfBrandMapper.deleteByPrimaryKey(brandId);
    }

    /**
     * 新增品牌
     * @param brandName
     * @param brandDes
     * @return
     */
    @Override
    public int addBrand(String brandName, String brandDes) {
        WFBrand wfBrand = new WFBrand();
        wfBrand.setBrandName(brandName);
        wfBrand.setBrandDes(brandDes);
        return wfBrandMapper.insert(wfBrand);
    }

    /**
     * 编辑品牌
     * @param brandId
     * @param brandName
     * @param brandDes
     * @return
     */
    @Override
    public int editBrand(int brandId, String brandName, String brandDes) {
        WFBrand wfBrand = new WFBrand();
        wfBrand.setBrandName(brandName);
        wfBrand.setBrandDes(brandDes);
        WFBrandExample wfBrandExample = new WFBrandExample();
        WFBrandExample.Criteria criteria = wfBrandExample.createCriteria();
        criteria.andBrandIdEqualTo(brandId);
        return wfBrandMapper.updateByExampleSelective(wfBrand,wfBrandExample);
    }
}
