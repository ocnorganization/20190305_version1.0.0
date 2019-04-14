/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.service;

import com.alexmillerning.pojo.WFMenus;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MenuTreeUtils {
        public final static List<WFMenus> getFatherNode(List<WFMenus> treesList){
            List<WFMenus> newTrees = new ArrayList<WFMenus>();
            for (WFMenus menu : treesList) {
                //该按钮的父节点id
                String parent_id = menu.getPmenuid();
                //该按钮的id
                String id = menu.getMenuid();
                //如果parent_id为0，则该节点为根节点
                if (StringUtils.isEmpty(parent_id)) {
//                System.out.println("ID: "+id+"PID: "+parent_id);
                    //对于当前根节点,遍历其他节点,当其它节点的父节点id等于当前根节点的id时,则为当前根节点的子节点
                    menu.setChild(getChildrenNode((id), treesList));
                    newTrees.add(menu);
                }
            }
            return newTrees;
        }

        /**
         * 获取当前节点的所有子节点
         * @param pId
         * @param treesList
         * @return
         */
        private final static List<WFMenus> getChildrenNode(String pId, List<WFMenus> treesList){
            List<WFMenus> newTrees = new ArrayList<WFMenus>();
            for (WFMenus menu : treesList) {
                //该按钮的父节点id
                String parent_id = menu.getPmenuid();
                //该按钮的id
                String id = menu.getMenuid();
                //当遍历到根节点时跳出本次循环
                if (StringUtils.isEmpty(parent_id)) continue;
                //当前节点的父节点id等于上级节点的id时,表示该节点为上级节点的子节点
                if(parent_id.equals(pId)){
//                System.out.println("ID: "+id+" "+"PID: "+parent_id);
                    //递归获取子节点下的子节点，即设置树控件中的children
                    menu.setChild(getChildrenNode(id, treesList));
                    //设置树控件attributes属性的数据
//                    Map<String, Object> map = new HashMap<String, Object>();
//                    map.put("url", menu.());
//                    menu.setAttributes(map);
                    newTrees.add(menu);
                }
            }
            return newTrees;
        }
}
