package com.apexengineeringhub.platform.dto.response;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String timestamp;
    private  int status;
    private String error;
    private String message;
    private String path;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }



    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
