package by.bsuir.webtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexPostController {

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String IndexPost(String username,String password){
        System.out.println("Login: " + username + ".\nPassword: " + password );
        return "index";
    }
}
