package by.bsuir.webtech.controller;

import by.bsuir.webtech.entity.User;
import by.bsuir.webtech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;
import java.util.Optional;

@Controller
public class AvatarPostController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/upload-avatar")
    public String uploadAvatar(@RequestParam("avatarFile")MultipartFile file, Principal principal) throws IOException {
        if(!file.isEmpty()){
            Optional<User> user = userRepository.findByUsername(principal.getName());
            if (user.isPresent()){
                user.get().setAvatar(file.getBytes());
                user.get().setAvatarMimeType(file.getContentType());
                userRepository.save(user.get());
            }
        }
        return "redirect:/";
    }

}
