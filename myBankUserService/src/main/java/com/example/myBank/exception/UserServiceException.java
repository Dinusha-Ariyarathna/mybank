package com.example.myBank.exception;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
public class UserServiceException extends RuntimeException {
    public UserServiceException(String message) {
        super(message);
    }
}
