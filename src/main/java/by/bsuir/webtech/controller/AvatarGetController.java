package by.bsuir.webtech.controller;

import by.bsuir.webtech.entity.User;
import by.bsuir.webtech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Optional;

@Controller
public class AvatarGetController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/avatar/{username}")
    public ResponseEntity<byte[]> getAvatar(@PathVariable String username){
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent())
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(user.get().getAvatarMimeType()))
                    .body(user.get().getAvatar());
        else
            return ResponseEntity.notFound().build();

    }
}
