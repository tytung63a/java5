package io.spring.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
@ToString
@Data
@Accessors(fluent = true) //hàm này bỏ từ get và set, nếu lấy và truyền tham số
@NoArgsConstructor
@AllArgsConstructor
public class Cate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ten;
	private Double so;

}
