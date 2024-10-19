package com.example.myBank.controller;

import com.example.myBank.common.CommonResponse;
import com.example.myBank.dto.UserDto;
import com.example.myBank.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
@RestController
@Slf4j
@RequestMapping("/api/users")
public class UserController {

    //REGISTER USER
    //UPDATE USER
    //DELETE USER
    //GET USER
    //GET ALL USERS
    //GET USER BY ID
    //GET USER BY EMAIL

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/register")
    public ResponseEntity<CommonResponse> registerUser(UserDto userDto){
        userService.registerUser(userDto);
        return ResponseEntity.ok(userService.registerUser(userDto));
    }

}
