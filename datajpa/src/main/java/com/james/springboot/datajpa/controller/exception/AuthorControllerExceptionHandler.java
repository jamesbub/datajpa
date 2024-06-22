package com.james.springboot.datajpa.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AuthorControllerExceptionHandler {

    @ExceptionHandler(value = CannotCreateTransactionException.class)
    public ResponseEntity<String> canNotCreateTransactionException(CannotCreateTransactionException e) {
        return ResponseEntity.internalServerError().body("Biswajeet had turned Off the Docker DB. Now Fuck Off ");
    }
}
