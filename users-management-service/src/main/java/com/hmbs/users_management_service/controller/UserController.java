package com.hmbs.users_management_service.controller;

import com.hmbs.users_management_service.dto.UserDto;
import com.hmbs.users_management_service.entity.User;
import com.hmbs.users_management_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    public List<User> users() {
        return userService.users();
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto users) {
        return new ResponseEntity<>(userService.register(users), HttpStatus.CREATED);
    }

//    @PostMapping("/login")
//    public String login(@RequestBody User users) {
//        return userService.verify(users);
//    }
}
