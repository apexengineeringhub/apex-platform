package com.apexengineeringhub.platform.exception;

import com.apexengineeringhub.platform.common.api.ApiResponse;
import com.apexengineeringhub.platform.common.api.ErrorDetail;
import com.apexengineeringhub.platform.dto.response.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * Handles unexpected exceptions and returns a standardized
     *  internal server error response.
     * @param exception
     * @param request
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleException(Exception exception, HttpServletRequest request) {

        exception.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ApiResponse.error(HttpStatus.INTERNAL_SERVER_ERROR,"An unexpected error occurred."));
    }

    /**
     *  Handles validation failures for request bodies.
     * @param exception
     * @param request
     * @returnHandles validation failures for request bodies.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Void>> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception,HttpServletRequest request){
        BindingResult bindingResult = exception.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        List<ErrorDetail> errorDetails=fieldErrors.stream()
                .map(fieldError -> ErrorDetail.builder()
                        .field(fieldError.getField())
                        .code(fieldError.getCode())
                        .message(fieldError.getDefaultMessage()).build())
                        .collect(Collectors.toList());



       return ResponseEntity.badRequest().body(ApiResponse.validation(HttpStatus.BAD_REQUEST,errorDetails));

    }
}
