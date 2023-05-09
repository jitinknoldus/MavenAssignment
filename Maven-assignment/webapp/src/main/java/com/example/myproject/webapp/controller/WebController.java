package com.example.myproject.webapp.controller;

import com.example.myproject.webapp.Service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    //Initialising WebService Class Object
    @Autowired
    private WebService webService;

    @RequestMapping("/info")
    @ResponseBody
    public String printInfo(){
        return webService.displayInfo();
    }
}
