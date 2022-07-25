package com.reserved.cafe.utilities.results;

public class BaseResult {

    private boolean success;
    private String message;

    public BaseResult(boolean success){
        this.success = success;
    }

    public BaseResult(boolean success, String message){
        this(success);
        this.message = message;
    }

    public boolean isSuccess(){
        return this.success;
    }

    public String getMessage(){
        return this.message;
    }
}