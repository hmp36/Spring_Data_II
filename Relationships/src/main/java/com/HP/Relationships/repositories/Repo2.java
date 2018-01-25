package com.HP.Relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.HP.Relationships.model.License;

public interface Repo2 extends CrudRepository<License, Long>{
	List<License> findAll();
}