package com.example.budget_app.controller;

import com.example.budget_app.dto.UserDto;
import com.example.budget_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/budget")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUsers(@RequestBody List<UserDto> userDTOList) {

            userService.addUsers(userDTOList);
            return ResponseEntity.ok("Users added successfully");

    }
}
