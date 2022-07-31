package com.symphony.symphonyapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceNotFoundExcpetion extends RuntimeException {

    public ResourceNotFoundExcpetion(String message) {
        super(message);
    }
}
