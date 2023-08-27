package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {
    public static void printListOfStudents(List<Student> students){
        students.forEach(System.out::println);
    }

    public static List<Student> getListOfPlatinumAlumniStudents(List<Student> students){
       return students.stream().filter(std->std.getDateOfAdmission()
               .isBefore(LocalDate.now().minusYears(30)))
               .sorted(Comparator.comparing(Student::getDateOfAdmission).reversed())
               .collect(Collectors.toList());
    }
    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(110001, "Dave", LocalDate.parse("11/18/1951", formatter)));
        studentList.add(new Student(110002, "Anna", LocalDate.parse("12/07/1990", formatter)));
        studentList.add(new Student(110003, "Erica", LocalDate.parse("01/31/1974", formatter)));
        studentList.add(new Student(110004, "Carlos", LocalDate.parse("08/22/2009", formatter)));
        studentList.add(new Student(110005, "Bob", LocalDate.parse("03/05/1990", formatter)));

        printListOfStudents(studentList);
        getListOfPlatinumAlumniStudents(studentList).forEach(System.out::println);
    }
}
