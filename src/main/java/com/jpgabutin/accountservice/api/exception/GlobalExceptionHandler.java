package com.jpgabutin.accountservice.api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import com.jpgabutin.accountservice.api.dto.CreateAccountResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CreateAccountResponse> handleValidationException(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getFieldError().getDefaultMessage();

        CreateAccountResponse response = new CreateAccountResponse(null, 400, message);

        return ResponseEntity.badRequest().body(response);
    }
}
