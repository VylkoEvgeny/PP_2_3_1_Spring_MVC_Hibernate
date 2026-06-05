package org.vylko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vylko.entity.User;
import org.vylko.service.UserService;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "index";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "newUser";
    }

    @PostMapping("/create")
    public String createNewUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users";
    }
}
