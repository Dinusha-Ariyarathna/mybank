package com.example.myBank.service;

import com.example.myBank.common.CommonResponse;
import com.example.myBank.dto.UserDto;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
public interface UserService{
    CommonResponse registerUser(UserDto userDto);
    CommonResponse updateUser(UserDto userDto);
    CommonResponse deleteUser(int id);
    CommonResponse getUser(int id);
    CommonResponse getAllUsers();
}
