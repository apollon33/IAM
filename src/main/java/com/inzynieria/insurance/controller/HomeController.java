package com.inzynieria.insurance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
    public class HomeController {

        @Autowired
        DataBaseController dataBaseController;

//        @RequestMapping(value="/home")
//        public void home(){
//            dataBaseController.create();
//        }



}
