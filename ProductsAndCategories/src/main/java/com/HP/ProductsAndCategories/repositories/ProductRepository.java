package com.HP.ProductsAndCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.ProductsAndCategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
