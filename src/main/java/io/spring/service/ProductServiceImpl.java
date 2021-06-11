package io.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import io.spring.entities.Product;
import io.spring.model.ProductModel;
import io.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product create(ProductModel productModel) {
		Product newProduct = convertToEntity(productModel, null);
		return productRepository.save(newProduct);
	}
	
	@Override
	public Product update(ProductModel productModel) {
		Integer id = Integer.parseInt(productModel.getId());
		Optional<Product> optional = productRepository.findById(id);
		if(optional.isPresent()) {
			Product newProduct = convertToEntity(productModel, null);
			return productRepository.save(newProduct);
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Product> readAll(String name) {
		List<Product> list = new ArrayList<Product>();
		if(StringUtils.isEmpty(name)) {
			list = productRepository.findAll();
		} else {
			list = productRepository.findByNameContaining(name);
		}
		return list;
	}

	@Override
	public Integer delete(Integer id) {
		productRepository.deleteById(id);
		return id;
	}

	@Override
	public List<Product> readPage(int pageSize, int pageNumber) {
		//create page able
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		/* Page<Product> page = productRepository.page(pageable); */
//		
//		List<Product> result = PageImpl.
//		
//		
		return null;
	}

	@Override
	public ProductModel getById(Integer id) {
		Optional<Product> optional = productRepository.findById(id);
		if(optional.isPresent()) {
			Product entity = optional.get();
			ProductModel model = convertToModel(entity, null);
			return model;
		}
		return null;
	}

	@Override
	public Product convertToEntity(ProductModel model, Product entity){
		if(entity == null)
			entity = new Product();
		BeanUtils.copyProperties(model, entity, "image");
		if(model.getImage() != null) {
			String imageName = model.getImage().getName();
			entity.setImage(imageName);
		}
		return entity;
	}
	
	@Override
	public ProductModel convertToModel(Product entity, ProductModel model){
		if(model == null)
			model = new ProductModel();
		BeanUtils.copyProperties(entity, model);
		return model;
	}

}