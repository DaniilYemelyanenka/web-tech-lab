package by.bsuir.webtech.controller;

import by.bsuir.webtech.Model.ListDemo;
import by.bsuir.webtech.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexGetController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model){
        model.addAttribute("username", "user");
        model.addAttribute("message","Лабораторная работа 4");
        return "index";
    }



}
