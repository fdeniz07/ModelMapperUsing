package com.TestMapper.controller;

import com.TestMapper.dto.UserDTO;
import com.TestMapper.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1")
public class MainRestController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public UserDTO getUser() {
        return userService.getUser();
    }
}
