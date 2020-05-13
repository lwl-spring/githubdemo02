package com.cfm.entity;

public class ResultEntity<T> {
    private String result;
    private String message;
    private T data;

    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";
    public static final String NO_MSG = "NO_MSG";
    public static final String NO_DATA = "NO_DATA";

    public static ResultEntity<String> successNoData() {
        return new ResultEntity<String>(SUCCESS, NO_MSG, NO_DATA);
    }

    public static <T> ResultEntity<T> successWithData(T data) {
        return new ResultEntity<>(SUCCESS, NO_MSG, data);
    }

    public static <T> ResultEntity<T> failed(String message) {
        return new ResultEntity<>(FAILED, message, null);
    }

    public ResultEntity(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public ResultEntity() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
