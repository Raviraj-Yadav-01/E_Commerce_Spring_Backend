package com.example.ecommercespring.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

    private int status;

    private String message;

    private LocalDateTime timestamp;

     ErrorResponse(int status, String message, LocalDateTime timestamp){

        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
