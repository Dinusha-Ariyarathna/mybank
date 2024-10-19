package com.example.myBank.exception;

import com.example.myBank.common.CommonResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public CommonResponse handleUserServiceException(UserServiceException ex) {
        return new CommonResponse(ex.getMessage(), false);
    }
}
