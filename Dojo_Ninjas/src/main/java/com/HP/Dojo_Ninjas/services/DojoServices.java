package com.HP.Dojo_Ninjas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.HP.Dojo_Ninjas.models.Dojo;
import com.HP.Dojo_Ninjas.repositories.DojoRepository;

@Service
public class DojoServices {
	private DojoRepository dojoRepository;

	public DojoServices(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public ArrayList<Dojo> getAll(){
		return dojoRepository.findAll();
	}
	public Dojo getDojo(Long id) {
		return dojoRepository.findOne(id);
	}
	public void addDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	public List<Object[]> dojosAndNinjas(){
		return dojoRepository.joinDojosAndNinjas2();
	}
 


	

}
