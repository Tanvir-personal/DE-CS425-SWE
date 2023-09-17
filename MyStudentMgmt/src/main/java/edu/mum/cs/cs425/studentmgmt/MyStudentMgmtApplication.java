package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ITranscriptRepository;
import edu.mum.cs.cs425.studentmgmt.service.ClassRoomService;
import edu.mum.cs.cs425.studentmgmt.service.StudentService;
import edu.mum.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class MyStudentMgmtApplication implements CommandLineRunner {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TranscriptService transcriptService;
    @Autowired
    private ClassRoomService classRoomService;

    public static void main(String[] args) {

        SpringApplication.run(MyStudentMgmtApplication.class, args);

    }

    private void saveStudent() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Student student1 = Student.builder()
                .studentNumber("000-61-0001")
                .firstName("Anna")
                .lastName("Fritz")
                .cgpa(3.8f)
                .dateOfEnrollment(LocalDate.parse("11/18/2021", formatter))
                .build();

        studentService.createStudent(student1);

    }

    private void saveStudentWithTranscript() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Transcript transcript = Transcript.builder()
                .degreeTitle("BS Computer Science")
                .build();
        transcript = transcriptService.createTranscript(transcript);
        Student student1 = Student.builder()
                .studentNumber("000-61-0090")
                .firstName("Steve")
                .lastName("Smith")
                .cgpa(3.6f)
                .dateOfEnrollment(LocalDate.parse("10/11/2022", formatter))
                .transcript(transcript)
                .build();

        Student student2 = Student.builder()
                .studentNumber("000-61-0043")
                .firstName("John")
                .lastName("Doe")
                .cgpa(3.2f)
                .dateOfEnrollment(LocalDate.parse("09/10/2022", formatter))
                .transcript(transcript)
                .build();

        studentService.createStudent(student1);
        studentService.createStudent(student2);
    }

    private void saveStudentWithClassRoom() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Transcript transcript = Transcript.builder()
                .degreeTitle("BS Computer Science")
                .build();
        transcript = transcriptService.createTranscript(transcript);
        ClassRoom room = ClassRoom.builder()
                .buildingName("McLaughlin Building")
                .roomNumber("M105")
                .build();
        room = classRoomService.createClassRoom(room);
        Student student1 = Student.builder()
                .studentNumber("000-61-0090")
                .firstName("Steve")
                .lastName("Smith")
                .cgpa(3.6f)
                .dateOfEnrollment(LocalDate.parse("10/11/2022", formatter))
                .transcript(transcript)
                .classRoom(room)
                .build();

        Student student2 = Student.builder()
                .studentNumber("000-61-0043")
                .firstName("John")
                .lastName("Doe")
                .cgpa(3.2f)
                .dateOfEnrollment(LocalDate.parse("09/10/2022", formatter))
                .transcript(transcript)
                .classRoom(room)
                .build();

        studentService.createStudent(student1);
        studentService.createStudent(student2);
    }

    @Override
    public void run(String... args) throws Exception {
        //saveStudent();
        //saveStudentWithTranscript();
        saveStudentWithClassRoom();
    }


}
