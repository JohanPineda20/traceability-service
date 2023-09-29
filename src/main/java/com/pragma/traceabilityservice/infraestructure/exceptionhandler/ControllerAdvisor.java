package com.pragma.traceabilityservice.infraestructure.exceptionhandler;

import com.pragma.traceabilityservice.domain.exception.DataNotFoundException;
import com.pragma.traceabilityservice.domain.exception.DomainException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;

@ControllerAdvice
public class ControllerAdvisor {
    private final String MESSAGE = "message";
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValid(MethodArgumentNotValidException methodArgumentNotValidException) {
        Map<String, String> body = new HashMap<>();
        methodArgumentNotValidException.getAllErrors().forEach(e -> {
            String fieldName = ((FieldError) e).getField();
            String message = e.getDefaultMessage();
            body.put(fieldName, message);
        });
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(DomainException.class)
    public ResponseEntity<Map<String, String>> handleDomainException(DomainException domainException) {
        return new ResponseEntity<>(Collections.singletonMap(MESSAGE, domainException.getMessage()), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(DataFormatException.class)
    public ResponseEntity<Map<String, String>> handleDataNotFoundException(DataNotFoundException dataNotFoundException) {
        return new ResponseEntity<>(Collections.singletonMap(MESSAGE, dataNotFoundException.getMessage()), HttpStatus.NOT_FOUND);
    }
}