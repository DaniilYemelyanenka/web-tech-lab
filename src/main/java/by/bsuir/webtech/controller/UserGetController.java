package by.bsuir.webtech.controller;

import by.bsuir.webtech.entity.User;
import by.bsuir.webtech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class UserGetController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable(value = "id") int id, Model model){
         Optional<User> userOptional = userRepository.findById(id);
         if(userOptional.isPresent()){
             model.addAttribute("user", userOptional.get());
             return "userPage";
         }else
             return "index";

    }
}
