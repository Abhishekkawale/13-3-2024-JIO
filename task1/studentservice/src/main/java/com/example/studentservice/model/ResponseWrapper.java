package com.example.studentservice.model;

import java.util.List;

public class ResponseWrapper<T> {
    private T data;
    private String message;
    private boolean error;
    private int statusCode;

    private List<Student> additionalData;

    // Getters and setters



    public ResponseWrapper(T data, String message, boolean error, int statusCode, List<Student> additionalData ) {
        this.data = data;
        this.message = message;
        this.error = error;
        this.statusCode = statusCode;
        this.additionalData = additionalData;
    }

    public ResponseWrapper() {

    }





    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public List<Student> getAdditionalData() {
        return additionalData;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setAdditionalData(List<Student> additionalData) {
        this.additionalData = additionalData;
    }
}
