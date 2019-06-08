/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.pojo.WFMenus;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.pojo.menu.MenuTree;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void test(){


//        MenuTree menuTree = new MenuTree();
//        List<MenuTree.MenusBean> menusBeanList = new ArrayList<>();
//        for (WFMenus pMenus : wfMenusList) {
//            String pid = pMenus.getPmenuid();
//            //为空则为父节点,获取该节点的子节点
//            if (StringUtils.isEmpty(pid)) {
//                //menubeanlist元素
//                MenuTree.MenusBean menusBean = new MenuTree.MenusBean();
//                //子节点
//                List<MenuTree.MenusBean.ChildBean> childBeanList = new ArrayList<>();
//                //父节点的id
//                String id = pMenus.getMenuid();
//                //遍历list找出pid=id
//                for (WFMenus menus : wfMenusList) {
//                    //获取当前节点的父id
//                    String ppid = menus.getPmenuid();
//                    //遍历到根节点跳出循环
//                    if (StringUtils.isEmpty(ppid)) continue;
//                    //ppid = id,则为当前节点的子节点
//                    if(ppid.equals(id)){
//                        MenuTree.MenusBean.ChildBean childBean = new MenuTree.MenusBean.ChildBean();
//                        childBean.setMenuid(menus.getMenuid());
//                        childBean.setPmenuid(menus.getPmenuid());
//                        childBean.setMenuname(menus.getMenuname());
//                        childBean.setMenustatus(menus.getMenustatus());
//                        childBean.setMenuurl(menus.getMenuurl());
//                        childBeanList.add(childBean);
//                    }
//                }
//                menusBean.setChild(childBeanList);
//                menusBean.setMenuid(pMenus.getMenuid());
//                menusBean.setMenuname(pMenus.getMenuname());
//                menusBean.setMenustatus(pMenus.getMenustatus());
//                menusBeanList.add(menusBean);
//            }
//        }
//        menuTree.setMenus(menusBeanList);
//        System.out.println(GsonUtils.toJson(menuTree));
    }

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

    public static void main(String[] args) {
        List<WFMenus> wfMenusList = new ArrayList<>();
        WFMenus wfMenus1 = new WFMenus();
        wfMenus1.setMenuid("1");
        wfMenus1.setPmenuid("");
        wfMenus1.setMenuname("设计元素");
        wfMenus1.setMenustatus("CLOSED");
        wfMenus1.setMenuurl("");

        WFMenus wfMenus2 = new WFMenus();
        wfMenus2.setMenuid("11");
        wfMenus2.setPmenuid("1");
        wfMenus2.setMenuname("颜色");
        wfMenus2.setMenustatus("CLOSED");
        wfMenus2.setMenuurl("/design/color/data.html");

        WFMenus wfMenus3 = new WFMenus();
        wfMenus3.setMenuid("111");
        wfMenus3.setPmenuid("11");
        wfMenus3.setMenuname("品牌");
        wfMenus3.setMenustatus("CLOSED");
        wfMenus3.setMenuurl("/design/color/data.html");

        WFMenus wfMenus4 = new WFMenus();
        wfMenus4.setMenuid("2");
        wfMenus4.setPmenuid("");
        wfMenus4.setMenuname("物料管理");
        wfMenus4.setMenustatus("CLOSED");
        wfMenus4.setMenuurl("");

        WFMenus wfMenus5 = new WFMenus();
        wfMenus5.setMenuid("21");
        wfMenus5.setPmenuid("2");
        wfMenus5.setMenuname("颜色");
        wfMenus5.setMenustatus("CLOSED");
        wfMenus5.setMenuurl("/design/color/data.html");

        wfMenusList.add(wfMenus1);
        wfMenusList.add(wfMenus2);
        wfMenusList.add(wfMenus3);
        wfMenusList.add(wfMenus4);
        wfMenusList.add(wfMenus5);

        MenuTree menuTree = new MenuTree();
        List<MenuTree.MenusBean> list = getFather(wfMenusList);
        menuTree.setMenus(list);

        System.out.println(GsonUtils.toJson(menuTree));


    }
}
