package com.knowy.layer_architecture_example.controller;

import com.knowy.layer_architecture_example.controller.dto.UserLoginForm;
import com.knowy.layer_architecture_example.service.AccessService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccessController {

    private final AccessService accessService;

    public AccessController(AccessService accessService) {
        this.accessService = accessService;
    }

    @GetMapping("login")
    public String login(Model model) {
        UserLoginForm userLoginForm = new UserLoginForm();

        model.addAttribute("userLoginForm", userLoginForm);
        return "simple-form-user";
    }

    @PostMapping("login")
    public String checkLogin(@ModelAttribute("userLoginForm") UserLoginForm userLoginForm) {
        boolean isAuthenticated = accessService.authenticate(userLoginForm.getEmail(), userLoginForm.getPassword());

        if (isAuthenticated) {
            return "redirect:public-user/private";
        }
        return "simple-form-user";
    }

}
