package com.example.Client.shared.exception.base;

import org.springframework.http.HttpStatus;

public class InactiveClientException extends BaseException{
    public InactiveClientException(String message) {
        super(false, HttpStatus.NOT_ACCEPTABLE, message, ExceptionCode.CLIENT_INACTIVE);
    }
}
