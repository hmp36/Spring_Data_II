package com.HP.ProductsAndCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.HP.ProductsAndCategories.models.Joint;
@Repository
public interface JointRepository extends CrudRepository<Joint, Long> {

}
