package com.estsoft.springdemoproject.controller;

import com.estsoft.springdemoproject.repository.Student;
import com.estsoft.springdemoproject.repository.StudentJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentJdbcRepository studentJdbcRepository;

    // StudentJdbcRepository 의존성 주입
    @Autowired
    public StudentController(StudentJdbcRepository studentJdbcRepository) {
        this.studentJdbcRepository = studentJdbcRepository;
    }

    // 모든 학생 이름 목록 조회
    @GetMapping("/names")
    public ResponseEntity<List<String>> getStudentNames() {
        List<String> studentNames = studentJdbcRepository.selectStudentNameList();
        return ResponseEntity.ok(studentNames);
    }

    // 특정 학생 이름과 나이를 조건으로 조회
    @GetMapping("/name-age")
    public ResponseEntity<Map<String, Object>> getStudentByNameAndAge(
            @RequestParam String name,
            @RequestParam Integer age) {
        Map<String, Object> studentInfo = studentJdbcRepository.selectStudentName(name, age);
        return ResponseEntity.ok(studentInfo);
    }

    // 이름과 나이를 조건으로 전체 학생 정보 조회 (NamedParameterJdbcTemplate 사용)
    @GetMapping("/full-info")
    public ResponseEntity<Student> getStudentFullInfo(
            @RequestParam String name,
            @RequestParam Integer age) {
        Student student = studentJdbcRepository.selectStudentName3(name, age);
        return ResponseEntity.ok(student);
    }

    // 모든 강사 이름 목록 조회
    @GetMapping("/instructors")
    public ResponseEntity<List<String>> getInstructorNames() {
        List<String> instructorNames = studentJdbcRepository.selectInstructorNameList();
        return ResponseEntity.ok(instructorNames);
    }
}
