package com.chin.oa.service.exception;

public class LeaveFormException extends RuntimeException{
    public LeaveFormException(String message) {
        super(message);//直接调用父类的默认逻辑就可以了
    }
}
