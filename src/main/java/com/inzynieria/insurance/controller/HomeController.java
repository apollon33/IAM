package com.inzynieria.insurance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
    public class HomeController {

        @Autowired
        DataBaseController dataBaseController;

        @RequestMapping(value="/home")
        public String home(){
            return "home";
        }

        @RequestMapping(value="/login")
        public String login(){
         return "login/login";
            }

        @RequestMapping(value = "/find/findUser")
        public String findUser(){ return "find/findUser";}

        @RequestMapping(value = "/find/findOffer")
         public String findOffer(){ return "find/findOffer";}

        @RequestMapping(value = "/find/findApplication")
        public String findApplications(){ return "find/findApplication";}

}
