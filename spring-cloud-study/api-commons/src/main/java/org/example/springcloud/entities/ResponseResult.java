package org.example.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 1:39 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> implements Serializable {
    private int responseCode;
    private String message;
    private T data;

    public static <T> ResponseResult<T> buildSuccessResult() {
        return buildSuccessResult(null);
    }

    public static <T> ResponseResult<T> buildSuccessResult(T data) {
        return buildResponseResult(HttpStatus.OK, data);
    }

    public static <T> ResponseResult<T> buildResponseResult(HttpStatus httpStatus, T data) {
        return new ResponseResult<>(httpStatus.value(), httpStatus.name(), data);
    }

    public static <T> ResponseResult<T> buildResponseResult(HttpStatus httpStatus, String message, T data) {
        return new ResponseResult<>(httpStatus.value(), message, data);
    }
}
