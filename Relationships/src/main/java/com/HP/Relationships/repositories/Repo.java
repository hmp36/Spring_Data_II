package com.HP.Relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.HP.Relationships.model.Person;

public interface Repo extends CrudRepository<Person, Long>{
	List<Person> findAll();
}
