/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;

import com.ourproject.service.HostelService;
import com.ourproject.service.RoomService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author admin
 */
@Controller

public class IndexController {
    @Autowired
    private HostelService hostelService;
    @Autowired
    private RoomService roomService;   
   
    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("hostels", this.hostelService.getHostel());
        model.addAttribute("rooms", this.roomService.getRooms());
        
        return "index";
    }
}
