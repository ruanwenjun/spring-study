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
    private HttpStatus httpStatus;
    private String message;
    private T data;

    public static <T> ResponseResult<T> buildSuccessResult() {
        return new ResponseResult<>(HttpStatus.OK, null, null);
    }

    public static <T> ResponseResult<T> buildSuccessResult(T data) {
        return new ResponseResult<>(HttpStatus.OK, null, data);
    }
}
