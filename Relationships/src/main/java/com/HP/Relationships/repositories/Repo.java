package com.HP.Relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.Relationships.model.Person;
@Repository
public interface Repo extends CrudRepository<Person, Long>{
	List<Person> findAll();
}
