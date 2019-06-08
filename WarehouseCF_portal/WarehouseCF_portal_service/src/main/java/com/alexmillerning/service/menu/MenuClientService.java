/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.menu;

import com.alexmillerning.utils.pojo.menu.MenuTree;

/**
 * @name MenuClientService
 * @author Alex
 * @date 2019/6/6
 * @description 菜单请求服务器数据接口
 */
public interface MenuClientService {
    /**
     * 获取主页导航菜单按钮
     * @return
     */
    MenuTree getMenuTree();
}
