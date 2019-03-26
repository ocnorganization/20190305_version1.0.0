package com.alexmillerning.service;

import com.alexmillerning.pojo.WBMenus;
import com.alexmillerning.utils.pojo.EasyUITree;

import java.util.List;

public interface WBMenusService {
    List<WBMenus> getWBMenusList();
    List<EasyUITree> getEasyUITreeListByParentId(String parent);
}
