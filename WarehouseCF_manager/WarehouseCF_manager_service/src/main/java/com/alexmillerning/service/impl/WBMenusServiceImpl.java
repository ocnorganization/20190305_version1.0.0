package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WBMenusMapper;
import com.alexmillerning.pojo.WBMenus;
import com.alexmillerning.pojo.WBMenusExample;
import com.alexmillerning.service.WBMenusService;
import com.alexmillerning.utils.pojo.Attributes;
import com.alexmillerning.utils.pojo.EasyUITree;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WBMenusServiceImpl implements WBMenusService {
    final Logger logger = Logger.getLogger(WBMenusServiceImpl.class);
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
    @Override
    /**
     * @methodname getEasyUITreeListByParentId
     * @author Alex
     * @date 2019/3/25
     * @param [parent]
     * @return java.util.List<com.alexmillerning.utils.pojo.EasyUITree>
     * @description 获取按钮菜单父节点
     */
    public List<EasyUITree> getEasyUITreeListByParentId(String parent) {
        WBMenusExample wbMenusExample = new WBMenusExample();
        WBMenusExample.Criteria criteria = wbMenusExample.createCriteria();
        criteria.andPidEqualTo(parent);
        List<WBMenus> wbMenusList = wbMenusMapper.selectByExample(wbMenusExample);
        List<EasyUITree> easyUITreeList = new ArrayList<>(wbMenusList.size());
        for(WBMenus wbMenus : wbMenusList){
            Attributes attributes = new Attributes();
            attributes.setUrl(wbMenus.getUrl());
            EasyUITree easyUITree = new EasyUITree();
            easyUITree.setId(Integer.parseInt(wbMenus.getId()));
            easyUITree.setText(wbMenus.getText());
            easyUITree.setState(wbMenus.getState());
            easyUITree.setAttributes(attributes);
            easyUITreeList.add(easyUITree);
            if(logger.isDebugEnabled()){
                logger.debug(wbMenus.toString());
            }
        }
        return easyUITreeList;
    }
}
