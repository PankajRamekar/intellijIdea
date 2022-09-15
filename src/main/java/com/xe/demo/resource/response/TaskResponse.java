package com.xe.demo.resource.response;

import org.springframework.http.HttpStatus;

import java.util.Objects;


public class TaskResponse {

    private String token;
    private HttpStatus httpStatus;
    private String message;
    private Object data;

    public TaskResponse() {
    }

    public TaskResponse(String token, HttpStatus httpStatus, String message, Object data) {
        this.token = token;
        this.httpStatus = httpStatus;
        this.message = message;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskResponse)) return false;
        TaskResponse that = (TaskResponse) o;
        return Objects.equals(token, that.token) && httpStatus == that.httpStatus && Objects.equals(message, that.message) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, httpStatus, message, data);
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "token='" + token + '\'' +
                ", httpStatus=" + httpStatus +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
