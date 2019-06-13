/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFMenus;
import com.alexmillerning.pojo.WFMenutree;
import com.alexmillerning.utils.pojo.menu.MenuTree;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MenuTreeUtils {
    public static List<MenuTree.MenusBean> getFather(List<WFMenus> wfMenusList){
        List<MenuTree.MenusBean> menusBeanList = new ArrayList<>();
        for (WFMenus pMenus : wfMenusList) {
            String pid = pMenus.getPmenuid();
            String id = pMenus.getMenuid();
            //为空则为父节点,获取该节点的子节点
            if (StringUtils.isEmpty(pid)) {
                //menubeanlist元素
                MenuTree.MenusBean menusBean = new MenuTree.MenusBean();
                menusBean.setMenuid(pMenus.getMenuid());
                menusBean.setMenuname(pMenus.getMenuname());
                menusBean.setMenustatus(pMenus.getMenustatus());
                menusBean.setChild(getChild(wfMenusList, id));
                menusBeanList.add(menusBean);
            }
        }
        return menusBeanList;
    }

    private static List<MenuTree.MenusBean.ChildBean> getChild(List<WFMenus> wfMenusList, String id){
        List<MenuTree.MenusBean.ChildBean> childBeanList = new ArrayList<>();
        for (WFMenus menus : wfMenusList) {
            //获取当前节点的父id
            String ppid = menus.getPmenuid();
            //获取当前节点的id
            String nId = menus.getMenuid();
            //遍历到根节点跳出循环
            if (StringUtils.isEmpty(ppid)) continue;
            //ppid = id,则为当前节点的子节点
            if(ppid.equals(id)){
                MenuTree.MenusBean.ChildBean childBean = new MenuTree.MenusBean.ChildBean();
                childBean.setMenuid(menus.getMenuid());
                childBean.setPmenuid(menus.getPmenuid());
                childBean.setMenuname(menus.getMenuname());
                childBean.setMenustatus(menus.getMenustatus());
                childBean.setMenuurl(menus.getMenuurl());
                childBean.setChild(getChild(wfMenusList,nId));
                childBeanList.add(childBean);
            }
        }
        return childBeanList;
    }

    public static List<MenuTree.MenusBean> getFatherMore(List<WFMenutree> wfMenusList){
        List<MenuTree.MenusBean> menusBeanList = new ArrayList<>();
        for (WFMenutree pMenus : wfMenusList) {
            String pid = pMenus.getPmenuid();
            String id = pMenus.getMenuid();
            //为空则为父节点,获取该节点的子节点
            if (StringUtils.isEmpty(pid)) {
                //menubeanlist元素
                MenuTree.MenusBean menusBean = new MenuTree.MenusBean();
                menusBean.setMenuid(pMenus.getMenuid());
                menusBean.setMenuname(pMenus.getMenuname());
                menusBean.setMenustatus(pMenus.getMenustatus());
                menusBean.setMenuicon(pMenus.getMenuicon());
                menusBean.setMenuauth(pMenus.getMenuauth());
                menusBean.setChild(getChildMore(wfMenusList, id));
                menusBeanList.add(menusBean);
            }
        }
        return menusBeanList;
    }

    private static List<MenuTree.MenusBean.ChildBean> getChildMore(List<WFMenutree> wfMenusList, String id){
        List<MenuTree.MenusBean.ChildBean> childBeanList = new ArrayList<>();
        for (WFMenutree menus : wfMenusList) {
            //获取当前节点的父id
            String ppid = menus.getPmenuid();
            //获取当前节点的id
            String nId = menus.getMenuid();
            //遍历到根节点跳出循环
            if (StringUtils.isEmpty(ppid)) continue;
            //ppid = id,则为当前节点的子节点
            if(ppid.equals(id)){
                MenuTree.MenusBean.ChildBean childBean = new MenuTree.MenusBean.ChildBean();
                childBean.setMenuid(menus.getMenuid());
                childBean.setPmenuid(menus.getPmenuid());
                childBean.setMenuname(menus.getMenuname());
                childBean.setMenustatus(menus.getMenustatus());
                childBean.setMenuurl(menus.getMenuurl());
                childBean.setMenuicon(menus.getMenuicon());
                childBean.setMenuauth(menus.getMenuauth());
                childBean.setChild(getChildMore(wfMenusList,nId));
                childBeanList.add(childBean);
            }
        }
        return childBeanList;
    }
}
