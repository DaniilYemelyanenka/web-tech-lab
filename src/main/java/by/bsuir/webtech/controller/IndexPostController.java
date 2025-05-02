package by.bsuir.webtech.controller;

import by.bsuir.webtech.entity.User;
import by.bsuir.webtech.repository.UserRepository;
import by.bsuir.webtech.service.MyUserDetailsService;
import by.bsuir.webtech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


@Controller
public class IndexPostController {

    @Autowired
    private UserService userService;

    @PostMapping("/new-user")
    public String IndexPost(String username,String password) {
        try {
            byte[] defaultAvatar = Files.readAllBytes(Paths.get("src/main/resources/static/images/avatar.png"));

            User user = userService.addUser(new User(username, password, "ROLE_ADMIN", defaultAvatar, "image/png"));
            return "redirect:/user/" + user.getId();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
