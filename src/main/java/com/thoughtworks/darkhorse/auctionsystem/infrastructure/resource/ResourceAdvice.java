package com.thoughtworks.darkhorse.auctionsystem.infrastructure.resource;

import com.thoughtworks.darkhorse.auctionsystem.domainmodel.AppException;
import com.thoughtworks.darkhorse.auctionsystem.appservice.representation.ErrorDetail;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

/**
 * 统一错误处理，用户捕获各层抛出的错误，统一返回
 */
@RestControllerAdvice
public class ResourceAdvice {

    @ExceptionHandler(value = AppException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDetail handAppException(AppException e) {
        return ErrorDetail.builder()
                .code(e.getErrorCode())
                .timestamp(Instant.now())
                .data(e.getData())
                .build();
    }
}
