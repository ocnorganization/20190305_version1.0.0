package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.BindmapMapper;
import com.alexmillerning.pojo.Bindmap;
import com.alexmillerning.pojo.BindmapExample;
import com.alexmillerning.service.BindmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BindmapServiceImpl implements BindmapService {
    @Autowired
    BindmapMapper bindmapMapper;

    @Override
    public Bindmap getBindmapById(String id) {
        BindmapExample bindmapExample = new BindmapExample();
        BindmapExample.Criteria criteria = bindmapExample.createCriteria();
        criteria.andServiceidEqualTo(id);
        List<Bindmap> bindmapList = bindmapMapper.selectByExample(bindmapExample);
        if(bindmapList != null){
            return bindmapList.get(0);
        }
        return null;
    }
}
