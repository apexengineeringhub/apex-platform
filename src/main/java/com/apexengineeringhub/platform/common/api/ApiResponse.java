package com.apexengineeringhub.platform.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import java.time.Instant;
import java.util.List;
import static org.springframework.http.HttpStatus.OK;


@Getter
@Builder
@AllArgsConstructor
public class ApiResponse<T> {
    private final Instant timestamp;
    private final int status;
    private final boolean success;
    private String message;
    private T data;
    private List<ErrorDetail> errors;

    /**
     * Creates a successful API response containing the provided data.
     *
     * @param data - Response payload.
     * @param <T>  - Type of the response payload.
     * @return - Standard successful API response.
     */
    public static <T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
                .timestamp(Instant.now())
                .status(HttpStatus.OK.value())
                .success(true)
                .data(data)
                .build();
    }

    /**
     * Creates a successful API response containing the provided message and response payload.
     *
     * @param message Success message returned to the client.
     * @param data    - Response payload.
     * @param <T>     - Type of the response payload.
     * @return - Standard successful API response.
     */
    public static <T> ApiResponse<T> success(String message, T data) {
        return ApiResponse.<T>builder()
                .timestamp(Instant.now())
                .status(OK.value())
                .success(true)
                .message(message)
                .data(data)
                .build();
    }

    /**
     * Creates a successful API response containing the provided message
     *
     * @param message Success message returned to the client.
     * @param <T>     - Type of the response payload.
     * @return Standard successful API response.
     */
    public static <T> ApiResponse<T> success(String message) {
        return ApiResponse.<T>builder()
                .timestamp(Instant.now())
                .status(OK.value())
                .success(true)
                .message(message)
                .build();
    }

    /**
     * Creates a failed API response containing the provided HTTP status and error message.
     *
     * @param status  HTTP status returned to the client.
     * @param message Error message returned to the client.
     * @param <T>     Type of the response payload.
     * @return Standard failed API response
     */
    public static <T> ApiResponse<T> error(HttpStatus status, String message) {
        return ApiResponse.<T>builder()
                .timestamp(Instant.now())
                .status(status.value())
                .success(false)
                .message(message)
                .build();
    }

    /**
     * VAlidation method to check data
     * @param status
     * @param errors
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> validation(
            HttpStatus status,
            List<ErrorDetail> errors) {
        return ApiResponse.<T>builder()
                .timestamp(Instant.now())
                .status(status.value())
                .success(false)
                .message("Validation failed.")
                .errors(errors)
                .build();
    }
}
