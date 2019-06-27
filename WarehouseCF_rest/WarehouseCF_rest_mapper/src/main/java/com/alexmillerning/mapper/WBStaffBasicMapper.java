package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WBStaffBasic;
import com.alexmillerning.pojo.WBStaffBasicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WBStaffBasicMapper {
    int countByExample(WBStaffBasicExample example);

    int deleteByExample(WBStaffBasicExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(WBStaffBasic record);

    int insertSelective(WBStaffBasic record);

    List<WBStaffBasic> selectByExample(WBStaffBasicExample example);

    WBStaffBasic selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") WBStaffBasic record, @Param("example") WBStaffBasicExample example);

    int updateByExample(@Param("record") WBStaffBasic record, @Param("example") WBStaffBasicExample example);

    int updateByPrimaryKeySelective(WBStaffBasic record);

    int updateByPrimaryKey(WBStaffBasic record);
}