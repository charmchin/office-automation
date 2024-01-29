package com.chin.oa.service.exception;

public class LoginException extends RuntimeException{
    public LoginException(String message) {
        super(message);//直接调用父类的默认逻辑就可以了
    }
}
