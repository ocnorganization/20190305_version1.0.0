package com.alexmillerning.mapper;

import com.alexmillerning.pojo.Bindmap;
import com.alexmillerning.pojo.BindmapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BindmapMapper {
    int countByExample(BindmapExample example);

    int deleteByExample(BindmapExample example);

    int insert(Bindmap record);

    int insertSelective(Bindmap record);

    List<Bindmap> selectByExample(BindmapExample example);

    int updateByExampleSelective(@Param("record") Bindmap record, @Param("example") BindmapExample example);

    int updateByExample(@Param("record") Bindmap record, @Param("example") BindmapExample example);
}