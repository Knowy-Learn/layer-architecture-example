package com.knowy.layer_architecture_example.controller;

import com.knowy.layer_architecture_example.controller.dto.PublicUserDto;
import com.knowy.layer_architecture_example.controller.dto.PublicUserDtoMapper;
import com.knowy.layer_architecture_example.controller.dto.PublicUserWithPrivateDataDto;
import com.knowy.layer_architecture_example.controller.dto.PublicUserWithPrivateDataDtoMapper;
import com.knowy.layer_architecture_example.service.PublicUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PublicUserController {

    private final PublicUserDtoMapper publicUserDtoMapper;
    private final PublicUserService publicUserService;
    private final PublicUserWithPrivateDataDtoMapper publicUserWithPrivateDataDtoMapper;

    public PublicUserController(PublicUserService publicUserService, PublicUserDtoMapper publicUserDtoMapper, PublicUserWithPrivateDataDtoMapper publicUserWithPrivateDataDtoMapper) {
        this.publicUserService = publicUserService;
        this.publicUserDtoMapper = publicUserDtoMapper;
        this.publicUserWithPrivateDataDtoMapper = publicUserWithPrivateDataDtoMapper;
    }

    @GetMapping("/public-user")
    public String publicUsers(Model model) {
        List<PublicUserDto> publicUsers = publicUserService.findAllPublicUsers().stream()
                .map(publicUserDtoMapper::fromDomain)
                .toList();

        model.addAttribute("items", publicUsers);
        return "simple-list-public-user";
    }

    @GetMapping("/public-user/private")
    public String privateUsers(Model model) {
        List<PublicUserWithPrivateDataDto> publicUsersWithPrivateData = publicUserService.findAllPublicUsers().stream()
                .map(publicUserWithPrivateDataDtoMapper::fromDomain)
                .toList();

        model.addAttribute("items", publicUsersWithPrivateData);
        return "simple-list-public-user-private";
    }
}
