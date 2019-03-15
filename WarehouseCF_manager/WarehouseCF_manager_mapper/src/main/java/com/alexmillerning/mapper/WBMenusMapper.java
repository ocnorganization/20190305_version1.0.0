package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WBMenus;
import com.alexmillerning.pojo.WBMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WBMenusMapper {
    int countByExample(WBMenusExample example);

    int deleteByExample(WBMenusExample example);

    int deleteByPrimaryKey(String id);

    int insert(WBMenus record);

    int insertSelective(WBMenus record);

    List<WBMenus> selectByExample(WBMenusExample example);

    WBMenus selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WBMenus record, @Param("example") WBMenusExample example);

    int updateByExample(@Param("record") WBMenus record, @Param("example") WBMenusExample example);

    int updateByPrimaryKeySelective(WBMenus record);

    int updateByPrimaryKey(WBMenus record);
}