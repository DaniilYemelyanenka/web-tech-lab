package by.bsuir.webtech.controller;

import by.bsuir.webtech.Model.ListDemo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexGetController {

    List<ListDemo> items = List.of(
            new ListDemo(1,"one"),
            new ListDemo(2,"two"),
            new ListDemo(3,"three")
    );

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model){
        model.addAttribute("username", "user");
        model.addAttribute("message","Лабораторная работа 2");
        model.addAttribute("listItems", items);
        return "index";
    }

}
