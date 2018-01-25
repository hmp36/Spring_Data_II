package com.HP.Relationships.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.HP.Relationships.model.Person;
import com.HP.Relationships.repositories.Repo;

@Service
public class PService {
	
	private Repo repo;
	
	public PService(Repo repo) {
		this.repo = repo;
	}
	
	public List<Person> getAll() {
		return repo.findAll();
	}
	
	public Person getPerson(Long id) {
		return repo.findOne(id);
	}
	
	@Transactional
	public void addPerson(Person person) {
		repo.save(person);
	}

}