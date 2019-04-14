package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WBColor;
import com.alexmillerning.pojo.WBColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WBColorMapper {
    int countByExample(WBColorExample example);

    int deleteByExample(WBColorExample example);

    int deleteByPrimaryKey(String colorId);

    int insert(WBColor record);

    int insertSelective(WBColor record);

    List<WBColor> selectByExample(WBColorExample example);

    WBColor selectByPrimaryKey(String colorId);

    int updateByExampleSelective(@Param("record") WBColor record, @Param("example") WBColorExample example);

    int updateByExample(@Param("record") WBColor record, @Param("example") WBColorExample example);

    int updateByPrimaryKeySelective(WBColor record);

    int updateByPrimaryKey(WBColor record);
}