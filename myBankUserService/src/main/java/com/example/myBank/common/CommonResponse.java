package com.example.myBank.common;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
public class CommonResponse {

    private String message;
    private Boolean status;
    private Object data;

    public CommonResponse(String message, Boolean status, Object data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public CommonResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public CommonResponse(String message) {
        this.message = message;
    }

    public CommonResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }

}
