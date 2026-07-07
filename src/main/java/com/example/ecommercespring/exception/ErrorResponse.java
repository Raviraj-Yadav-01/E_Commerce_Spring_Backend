package com.example.ecommercespring.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
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
