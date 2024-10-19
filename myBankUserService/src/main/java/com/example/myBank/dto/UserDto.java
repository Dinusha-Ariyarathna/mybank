package com.example.myBank.dto;

import lombok.Data;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
@Data
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String nic;
    private String dob;
}
