package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFMenus;
import com.alexmillerning.pojo.WFMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFMenusMapper {
    int countByExample(WFMenusExample example);

    int deleteByExample(WFMenusExample example);

    int deleteByPrimaryKey(String menuid);

    int insert(WFMenus record);

    int insertSelective(WFMenus record);

    List<WFMenus> selectByExample(WFMenusExample example);

    WFMenus selectByPrimaryKey(String menuid);

    int updateByExampleSelective(@Param("record") WFMenus record, @Param("example") WFMenusExample example);

    int updateByExample(@Param("record") WFMenus record, @Param("example") WFMenusExample example);

    int updateByPrimaryKeySelective(WFMenus record);

    int updateByPrimaryKey(WFMenus record);
}