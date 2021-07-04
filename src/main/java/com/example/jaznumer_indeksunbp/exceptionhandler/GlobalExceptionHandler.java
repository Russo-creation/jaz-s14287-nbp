package com.example.jaznumer_indeksunbp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.net.ConnectException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<ApiError> handle4xx(HttpClientErrorException ex) {
        HttpStatus statusCode = ex.getStatusCode();
        System.out.println(ex);

        return ResponseEntity.status(statusCode).body(new ApiError(statusCode, ex.getResponseBodyAsString()));
    }

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<ApiError> handle5xx(HttpServerErrorException ex) {
        HttpStatus statusCode = ex.getStatusCode();
        System.out.println(ex);

        return ResponseEntity.status(statusCode).body(new ApiError(statusCode, ex.getResponseBodyAsString()));
    }

    // ConnectException
    @ExceptionHandler(ConnectException.class)
    public ResponseEntity<Object> handleConnectException() {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).build();
    }

}
