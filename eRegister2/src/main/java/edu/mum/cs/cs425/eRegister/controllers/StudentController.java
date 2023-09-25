package edu.mum.cs.cs425.eRegister.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.cs.cs425.eRegister.models.Student;
import edu.mum.cs.cs425.eRegister.services.StudentService;

@Controller
public class StudentController {

   @Autowired private StudentService studentService;
	
	
	@GetMapping("/student")
	public String findAll(Model model){		
		model.addAttribute("students", studentService.findAll());
		return "index";
	}	
	@GetMapping("/student/findById/{id}")
	public Optional<Student> findById(@PathVariable Long id, Model model)
	{
		return studentService.findById(id);
	}

	@PostMapping(value="student/addNew")
	public String addNew(Student country) {
		studentService.save(country);
		return "redirect:/student";
	}	
	
	@RequestMapping(value="student/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Student country) {
		studentService.save(country);
		return "redirect:/student";
	}
	
	@GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
		studentService.delete(id);
        return "redirect:/student";
    }
}