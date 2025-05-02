package by.bsuir.webtech.controller;

import by.bsuir.webtech.entity.User;
import by.bsuir.webtech.repository.UserRepository;
import by.bsuir.webtech.service.MyUserDetailsService;
import by.bsuir.webtech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class IndexPostController {

    @Autowired
    private UserService userService;

    @PostMapping("/new-user")
    public String IndexPost(String username,String password){
        User user = userService.addUser(new User(username, password,"ROLE_ADMIN"));
        return "redirect:/user/" + user.getId();
    }
}
