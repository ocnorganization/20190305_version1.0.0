package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WStaff;
import com.alexmillerning.pojo.WStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WStaffMapper {
    /**
     * 添加分页查询
     * @param example
     * @return
     */
    List<WStaff> selectByExampleandPage(WStaffExample example);

    int countByExample(WStaffExample example);

    int deleteByExample(WStaffExample example);

    int deleteByPrimaryKey(String staffId);

    int insert(WStaff record);

    int insertSelective(WStaff record);

    List<WStaff> selectByExample(WStaffExample example);

    WStaff selectByPrimaryKey(String staffId);

    int updateByExampleSelective(@Param("record") WStaff record, @Param("example") WStaffExample example);

    int updateByExample(@Param("record") WStaff record, @Param("example") WStaffExample example);

    int updateByPrimaryKeySelective(WStaff record);

    int updateByPrimaryKey(WStaff record);
}