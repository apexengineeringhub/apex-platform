package com.apexengineeringhub.platform.exception;

import com.apexengineeringhub.platform.dto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * Handles unexpected exceptions and returns
     *  a standardized error response.
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e, HttpServletRequest request) {
        ErrorResponse response = new ErrorResponse();
        HttpStatus status =HttpStatus.INTERNAL_SERVER_ERROR;
        response.setTimestamp(LocalDateTime.now().toString());
        response.setStatus(status.value());
        response.setError(status.getReasonPhrase());
        response.setMessage(e.getMessage());
        response.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(response);
    }
}
