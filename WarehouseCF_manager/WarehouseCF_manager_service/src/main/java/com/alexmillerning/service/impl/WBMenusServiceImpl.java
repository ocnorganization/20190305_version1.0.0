package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WBMenusMapper;
import com.alexmillerning.pojo.WBMenus;
import com.alexmillerning.pojo.WBMenusExample;
import com.alexmillerning.service.WBMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WBMenusServiceImpl implements WBMenusService {
    @Autowired
    WBMenusMapper wbMenusMapper;
    @Override
    public List<WBMenus> getWBMenusList() {
        WBMenusExample wbMenusExample = new WBMenusExample();
        List<WBMenus> wbMenusList = wbMenusMapper.selectByExample(wbMenusExample);
        if(wbMenusList != null){
            return wbMenusList;
        }
        return null;
    }
}
