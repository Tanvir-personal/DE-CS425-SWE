package edu.mum.cs.cs425.eRegister.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private Double cgpa;
    private LocalDate enrollmentDate;
    private boolean isInternational; 
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentNumber() 
	{
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber)
	{
		this.studentNumber = studentNumber;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public Double getCgpa()
	{
		return cgpa;
	}
	public void setCgpa(Double cgpa) 
	{
		this.cgpa = cgpa;
	}
	public LocalDate getEnrollmentDate()
	{
		return enrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate)
	{
		this.enrollmentDate = enrollmentDate;
	}
	public boolean getIsInternational()
	{
		return isInternational;
	}
	public void setIsInternational(boolean isInternational)
	{
		this.isInternational = isInternational;
	}



}