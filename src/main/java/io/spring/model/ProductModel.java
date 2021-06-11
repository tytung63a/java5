package io.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import io.spring.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Create Product model to show .........
 * @author FPT-HUYPN6
 *
 */
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	//Blank = Empty + Null
	@NotBlank
	@Length(min = 5, max = 50)
	private String name;
	
	@NotBlank
	private String description;
	
	private Double price;
	
	private MultipartFile image;
	
	private Integer avaiable;

	private Integer quantity;

	//bi-directional many-to-one association to Category
	private Category category;

}