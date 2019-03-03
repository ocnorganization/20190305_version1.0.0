package com.alexmillerning.controller;


import com.alexmillerning.pojo.Bindmap;
import com.alexmillerning.service.BindmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BindmapController {
    @Autowired
    BindmapService bindmapService;
    @RequestMapping("/bindmap/{serviceid}")
    @ResponseBody
    public Bindmap getServiceById(@PathVariable String serviceid){
        System.out.println("serviceid: "+serviceid);
        Bindmap bindmap = bindmapService.getBindmapById(serviceid);
        return bindmap;
    }

}
