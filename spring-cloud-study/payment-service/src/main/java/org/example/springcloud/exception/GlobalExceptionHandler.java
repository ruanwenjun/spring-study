package org.example.springcloud.exception;

import org.example.springcloud.entities.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 2:40 PM
 */
@ControllerAdvice
public class GlobalExceptionHandler<T> {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseResult<T> exceptionHandler(HttpServletRequest req, NullPointerException e) {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR, null, null);
    }
}
