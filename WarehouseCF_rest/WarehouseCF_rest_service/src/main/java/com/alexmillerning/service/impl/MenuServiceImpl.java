/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFMenutreeMapper;
import com.alexmillerning.pojo.WFMenutree;
import com.alexmillerning.pojo.WFMenutreeExample;
import com.alexmillerning.service.MenuService;
import com.alexmillerning.utils.MenuTreeUtils;
import com.alexmillerning.utils.pojo.menu.MenuTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
//    @Autowired
//    WFMenusMapper wfMenusMapper;
    @Autowired
    WFMenutreeMapper wfMenutreeMapper;
    @Override
    public MenuTree getMenuTree() {
//        WFMenusExample wfMenusExample = new WFMenusExample();
//        List<WFMenus> wfMenusList = wfMenusMapper.selectByExample(wfMenusExample);
        WFMenutreeExample wfMenutreeExample = new WFMenutreeExample();
        List<WFMenutree> wfMenutreeList = wfMenutreeMapper.selectByExample(wfMenutreeExample);
        MenuTree menuTree = new MenuTree();
//        List<MenuTree.MenusBean> menusBeanList = MenuTreeUtils.getFather(wfMenusList);
        List<MenuTree.MenusBean> menusBeanList = MenuTreeUtils.getFatherMore(wfMenutreeList);
        menuTree.setMenus(menusBeanList);
        return menuTree;
    }
}
