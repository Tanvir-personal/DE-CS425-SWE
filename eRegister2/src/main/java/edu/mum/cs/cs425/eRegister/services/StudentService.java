package edu.mum.cs.cs425.eRegister.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.eRegister.models.Student;
import edu.mum.cs.cs425.eRegister.repositoies.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository StudentRepository;
	

	public List<Student> findAll(){
		return StudentRepository.findAll();
	}	
	

	public Optional<Student> findById(Long id) {
		return StudentRepository.findById(id);
	}	
	

	public void delete(Long id) {
		StudentRepository.deleteById(id);
	}
	
	
	public void save( Student student) {
		StudentRepository.save(student);
	}

}