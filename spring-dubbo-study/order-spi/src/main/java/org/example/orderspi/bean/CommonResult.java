package org.example.orderspi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 7:47 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

	private ResponseCode responseCode;
	private T result;
	private String message;

}
