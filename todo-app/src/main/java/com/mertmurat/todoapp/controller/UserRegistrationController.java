package com.mertmurat.todoapp.controller;


import com.mertmurat.todoapp.request.UserRegistrationRequest;
import com.mertmurat.todoapp.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class UserRegistrationController {

    private final UserService userService;

    @GetMapping
    public String showRegistration(Model model){
        model.addAttribute("user", new UserRegistrationRequest());
        return "registration";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") UserRegistrationRequest userRegistrationRequest){
        userService.save(userRegistrationRequest);
        return "redirect:/registration?success";
    }
}
