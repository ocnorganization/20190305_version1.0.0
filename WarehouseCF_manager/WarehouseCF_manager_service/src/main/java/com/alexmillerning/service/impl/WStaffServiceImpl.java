package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WStaffMapper;
import com.alexmillerning.pojo.WStaff;
import com.alexmillerning.pojo.WStaffExample;
import com.alexmillerning.service.WStaffService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;

@Service
/**
 * @name WStaffServiceImpl
 * @author Alex
 * @date 2019/3/22
 * @description 操作员工表数据的实现类,继承员工表的接口,实现所有方法
 */
public class WStaffServiceImpl implements WStaffService {
    final Logger logger = Logger.getLogger(WStaffServiceImpl.class);
    @Autowired
    WStaffMapper wStaffMapper;

    @Override
    /**
     * @methodname getWStaffList
     * @author Alex
     * @date 2019/3/22
     * @param []
     * @return java.util.List<com.alexmillerning.pojo.WStaff>
     * @description 查询员工表所有信息
     */
    public List<WStaff> getWStaffList() {
        WStaffExample wStaffExample = new WStaffExample();
        WStaffExample.Criteria criteria = wStaffExample.createCriteria();
        List<WStaff> wStaffList = wStaffMapper.selectByExample(wStaffExample);
        if(wStaffList != null){
            return wStaffList;
        }
        return null;
    }

    @Override
    /**
     * @methodname getWStaffListByPage
     * @author Alex
     * @date 2019/3/22
     * @param [pageSize, rowSize]
     * @return java.util.List<com.alexmillerning.pojo.WStaff>
     * @description 通过前端传递过来的pageSize和rowSize分页查询员工表
     */
    public List<WStaff> getWStaffListByPage(String pageSize,String rowSize) {
        WStaffExample wStaffExample = new WStaffExample();
        if(!StringUtils.isEmpty(pageSize)&&!StringUtils.isEmpty(rowSize)){
            Integer offSet = Integer.parseInt(rowSize)*(Integer.parseInt(pageSize)-1);
            Integer limit = Integer.parseInt(rowSize);
            if(logger.isDebugEnabled()){
                logger.debug("数据库分页查询 offset:["+offSet+"] limit: "+limit);
            }
            wStaffExample.setOffset(offSet);
            wStaffExample.setLimit(limit);
            List<WStaff> wStaffList = wStaffMapper.selectByExampleandPage(wStaffExample);
            return wStaffList;
        }
        return null;
    }

    @Override
    /**
     * @methodname getWStaffCount
     * @author Alex
     * @date 2019/3/22
     * @param []
     * @return int
     * @description 查询员工表中记录总数
     */
    public int getWStaffCount() {
        WStaffExample wStaffExample = new WStaffExample();
        int total = wStaffMapper.countByExample(wStaffExample);
        return total;
    }

    @Override
    /**
     * @methodname getWStaffListByIdorName
     * @author Alex
     * @date 2019/3/22
     * @param [staffId, staffName]
     * @return java.util.List<com.alexmillerning.pojo.WStaff>
     * @description 通过前端传递的staffId和staffName查询员工信息
     */
    public List<WStaff> getWStaffListByIdorName(String staffId,String staffName){
        WStaffExample wStaffExample = new WStaffExample();
        WStaffExample.Criteria criteriaId = wStaffExample.createCriteria();
        criteriaId.andStaffIdEqualTo(staffId);
        WStaffExample.Criteria criteriaName = wStaffExample.createCriteria();
        criteriaName.andStaffNameEqualTo(staffName);
        wStaffExample.or(criteriaName);
        List<WStaff> wStaffList = wStaffMapper.selectByExample(wStaffExample);
        return wStaffList;
    }
}
