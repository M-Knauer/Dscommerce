package com.knauer.dscommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knauer.dscommerce.dto.ProductDTO;
import com.knauer.dscommerce.entities.Product;
import com.knauer.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		return new ProductDTO(repository.findById(id).get());
	}

	public Page<ProductDTO> findAll(Pageable pageable) {
		Page<Product> entities = repository.findAll(pageable);
		
		return entities.map(dto -> new ProductDTO(dto));
	}
}
