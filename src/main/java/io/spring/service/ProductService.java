package io.spring.service;

import java.util.List;

import io.spring.entities.Product;
import io.spring.model.ProductModel;

public interface ProductService {
	
	Product create(ProductModel productModel);
	List<Product> readAll(String name);
	Product update(ProductModel productModel);
	Integer delete(Integer id);
	List<Product> readPage(int pageSize, int pageNumber);
	ProductModel getById(Integer id);
	
	public Product convertToEntity(ProductModel model, Product entity);
	public ProductModel convertToModel(Product entity, ProductModel model);
	
}