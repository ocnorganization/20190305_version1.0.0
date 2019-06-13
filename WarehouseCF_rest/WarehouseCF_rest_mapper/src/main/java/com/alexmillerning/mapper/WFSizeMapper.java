package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFSize;
import com.alexmillerning.pojo.WFSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFSizeMapper {
    int countByExample(WFSizeExample example);

    int deleteByExample(WFSizeExample example);

    int deleteByPrimaryKey(Integer sizeId);

    int insert(WFSize record);

    int insertSelective(WFSize record);

    List<WFSize> selectByExample(WFSizeExample example);

    WFSize selectByPrimaryKey(Integer sizeId);

    int updateByExampleSelective(@Param("record") WFSize record, @Param("example") WFSizeExample example);

    int updateByExample(@Param("record") WFSize record, @Param("example") WFSizeExample example);

    int updateByPrimaryKeySelective(WFSize record);

    int updateByPrimaryKey(WFSize record);
}