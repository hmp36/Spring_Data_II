package com.HP.Relationships.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.HP.Relationships.model.License;
import com.HP.Relationships.repositories.Repo2;

@Service
public class LService {
	public long num =0;
			
	private Repo2 repo;
	
	public LService(Repo2 repo) {
		this.repo = repo;
	}
	
	public List<License> getAll() {
		return repo.findAll();
	}
	
	public License getLicense(Long id) {
		return repo.findOne(id);
	}
	
	@Transactional
	public void addLicense(License license) {
		num+=1;
		String number = Long.toString(num);
		license.setNumber(number);
		repo.save(license);
	}

}
