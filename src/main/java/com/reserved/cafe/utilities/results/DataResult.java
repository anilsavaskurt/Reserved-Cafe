package com.reserved.cafe.utilities.results;

public class DataResult<T> extends BaseResult {

    private T data;

    public DataResult(T data, boolean success) {
        super(success);
        this.data = data;
    }

    public DataResult(T data, boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}