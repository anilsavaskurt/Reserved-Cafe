package com.reserved.cafe.utilities.results;

public class SuccessResult extends BaseResult{

    public SuccessResult(){
        super(true);
    }

    public SuccessResult(String message){
        super(true,message);
    }
}