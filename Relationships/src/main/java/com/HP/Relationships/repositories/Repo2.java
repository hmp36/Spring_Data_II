package com.HP.Relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.Relationships.model.License;
@Repository
public interface Repo2 extends CrudRepository<License, Long>{
	List<License> findAll();
}