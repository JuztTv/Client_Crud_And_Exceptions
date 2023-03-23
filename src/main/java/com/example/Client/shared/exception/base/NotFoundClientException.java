package com.example.Client.shared.exception.base;

import org.springframework.http.HttpStatus;

public class NotFoundClientException extends BaseException{
    public NotFoundClientException(String message) {
        super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.CLIENT_INACTIVE);
    }
}
