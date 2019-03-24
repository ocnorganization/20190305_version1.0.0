package com.alexmillerning.utils;

import com.alexmillerning.pojo.WBMenus;
import com.alexmillerning.pojo.WStaff;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @name EasyuiUtils
 * @author Alex
 * @date 2019/3/22
 * @description easyui相关的工具类
 */
public class EasyuiUtils {
    /**
     * 获取菜单的所有节点
     * @param treesList
     * @return
     */
    public final static List<WBMenus> getFatherNode(List<WBMenus> treesList){
        List<WBMenus> newTrees = new ArrayList<WBMenus>();
        for (WBMenus menu : treesList) {
            //该按钮的父节点id
            String parent_id = menu.getPid();
            //该按钮的id
            String id = menu.getId();
            //如果parent_id为0，则该节点为根节点
            if (StringUtils.isEmpty(parent_id)) {
//                System.out.println("ID: "+id+"PID: "+parent_id);
                //对于当前根节点,遍历其他节点,当其它节点的父节点id等于当前根节点的id时,则为当前根节点的子节点
                menu.setChildren(getChildrenNode((id), treesList));
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
    private final static List<WBMenus> getChildrenNode(String pId, List<WBMenus> treesList){
        List<WBMenus> newTrees = new ArrayList<WBMenus>();
        for (WBMenus menu : treesList) {
            //该按钮的父节点id
            String parent_id = menu.getPid();
            //该按钮的id
            String id = menu.getId();
            //当遍历到根节点时跳出本次循环
            if (StringUtils.isEmpty(parent_id)) continue;
            //当前节点的父节点id等于上级节点的id时,表示该节点为上级节点的子节点
            if(parent_id.equals(pId)){
//                System.out.println("ID: "+id+" "+"PID: "+parent_id);
                //递归获取子节点下的子节点，即设置树控件中的children
                menu.setChildren(getChildrenNode(id, treesList));
                //设置树控件attributes属性的数据
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("url", menu.getUrl());
                menu.setAttributes(map);
                newTrees.add(menu);
            }
        }
        return newTrees;
    }


    /**
     * @methodname generateJSONObj
     * @author Alex
     * @date 2019/3/22
     * @param list,size
     * @return JSONObject
     * @description 封装JSON数据返回给页面
     */
    public static JSONObject generateJSONObj(List<WStaff> list, int size){
        JSONArray jsonArray = new JSONArray(new ArrayList<>(list));
        Map<String,Object> json = new HashMap<String,Object>();
        json.put("total",size);
        json.put("rows",jsonArray);
        JSONObject jsonObject = new JSONObject(json);
        return jsonObject;
    }

}
