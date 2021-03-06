package com.HP.Dojo_Ninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HP.Dojo_Ninjas.services.DojoServices;
@Controller


@RequestMapping("/")
public class HomeController {	
	@Autowired
	private DojoServices dojoServices;
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("dojos", dojoServices.getAll());
		return "index.jsp";
	}
	

}
