package com.HP.ProductsAndCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.ProductsAndCategories.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
