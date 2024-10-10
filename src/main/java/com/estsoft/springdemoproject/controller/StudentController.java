package com.estsoft.springdemoproject.controller;

import com.estsoft.springdemoproject.entity.Student;
import com.estsoft.springdemoproject.repository.JdbcStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final JdbcStudentRepository studentRepository;

    // StudentRepository 의존성 주입
    @Autowired
    public StudentController(JdbcStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // 특정 학생의 이름을 조회
    @GetMapping("/student/{id}")
    public ResponseEntity<String> getStudentName(@PathVariable Long id) {
        return studentRepository.findById(id)
                .map(student -> ResponseEntity.ok(student.getName()))
                .orElse(ResponseEntity.notFound().build());
    }

    // 새로운 학생 정보를 저장
    @PostMapping("/student")
    public ResponseEntity<String> saveStudent(
            @RequestParam String name,
            @RequestParam Integer age,
            @RequestParam(required = false) String desc) {

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setDesc(desc);
        studentRepository.save(student);
        return ResponseEntity.ok("Student saved");
    }
}