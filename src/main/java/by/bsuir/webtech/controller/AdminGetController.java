package by.bsuir.webtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminGetController {

    @GetMapping("/admin")
    public String getAdminPage(Model model){
        return "adminPage";
    }
}
