package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFUnit;
import com.alexmillerning.pojo.WFUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFUnitMapper {
    int countByExample(WFUnitExample example);

    int deleteByExample(WFUnitExample example);

    int deleteByPrimaryKey(Integer unitId);

    int insert(WFUnit record);

    int insertSelective(WFUnit record);

    List<WFUnit> selectByExample(WFUnitExample example);

    WFUnit selectByPrimaryKey(Integer unitId);

    int updateByExampleSelective(@Param("record") WFUnit record, @Param("example") WFUnitExample example);

    int updateByExample(@Param("record") WFUnit record, @Param("example") WFUnitExample example);

    int updateByPrimaryKeySelective(WFUnit record);

    int updateByPrimaryKey(WFUnit record);
}