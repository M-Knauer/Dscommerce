package com.knauer.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knauer.dscommerce.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
