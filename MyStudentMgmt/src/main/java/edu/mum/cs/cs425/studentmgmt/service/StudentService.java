package edu.mum.cs.cs425.studentmgmt.service;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.repository.IStudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.ITranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepository;
    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudent(Long id){
        return studentRepository.findById(id).orElse(null);
    }
}
