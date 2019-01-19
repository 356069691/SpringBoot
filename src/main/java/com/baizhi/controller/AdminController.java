package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    /**
     * ceshi
     */
    @Autowired
    private AdminService adminService;

    @RequestMapping("/find")
    public String find(String username, String password, HttpSession session){
        Admin admin = adminService.find(username,password);
         if(admin!=null){
             session.setAttribute("admin",admin);
             return "redirect:/product/findAll";
         }else{
             return "redirect:/views/login.jsp";
         }
    }

}
