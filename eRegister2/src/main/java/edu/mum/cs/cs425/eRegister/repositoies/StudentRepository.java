package edu.mum.cs.cs425.eRegister.repositoies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.eRegister.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}