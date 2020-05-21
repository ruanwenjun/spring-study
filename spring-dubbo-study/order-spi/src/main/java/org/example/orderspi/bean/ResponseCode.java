package org.example.orderspi.bean;

import java.io.Serializable;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 7:48 PM
 */
public enum ResponseCode implements Serializable {

	SUCCESS(200, "success"),
	BAD_REQUEST(400, "bad_request"),
	ERROR(500, "error");


	private int code;
	private String message;

	ResponseCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
