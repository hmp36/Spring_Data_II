package com.HP.Relationships.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.HP.Relationships.model.License;
import com.HP.Relationships.repositories.Repo2;

@Service
public class LService {
	
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
		Long personId = ((License) license.getPerson()).getId();
		String licNum = String.format("%06d", personId);
		license.setNumber(licNum);
		repo.save(license);
	}

}
