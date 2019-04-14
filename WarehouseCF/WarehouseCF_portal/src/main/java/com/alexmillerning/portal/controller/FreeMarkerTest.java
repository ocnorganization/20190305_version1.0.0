/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeMarkerTest {
    @RequestMapping("/freemarker")
    public String freeMarker(Model model){
        model.addAttribute("name","freeMarker");
        return "freeMarker";
    }

    @RequestMapping("/freemarkerwrite")
    public String freeMarkerWrite(Model model){
        model.addAttribute("name","freeMarker");
        return "freeMarkerWrite";
    }
}
