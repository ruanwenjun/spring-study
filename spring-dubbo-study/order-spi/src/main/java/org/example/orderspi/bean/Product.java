package org.example.orderspi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 7:23 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

	private String id;

	private Integer money;


}
