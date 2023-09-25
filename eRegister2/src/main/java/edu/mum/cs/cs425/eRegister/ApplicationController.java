package edu.mum.cs.cs425.eRegister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.mum.cs.cs425.eRegister.services.StudentService;

@Controller
public class ApplicationController
{
	 @Autowired private StudentService StudentService;
		
		
	@GetMapping("/student")
	public String findAll(Model model){		
		model.addAttribute("students", StudentService.findAll());
		return "index";
	}	

}
