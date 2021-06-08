package io.spring.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	// Blank = Empty + Null
	@NotBlank(message = "Name is mandatory")
	@Length(min = 5, max = 50, message = "Name is 5 - 50 chars")
	private String name;

	@NotBlank(message = "Description is mandatory") // tự tạo thông báo lỗi
	private String description;

	private Double price;

}