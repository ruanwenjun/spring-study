package org.example.orderspi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 7:22 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

	private String id;

	private List<Product> productList;

}
