package com.estsoft.springdemoproject.controller;

import com.estsoft.springdemoproject.entity.LectureCourse;
import com.estsoft.springdemoproject.repository.LectureCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class LectureCourseController {
    @Autowired
    private LectureCourseRepository lectureCourseRepository;

    @PostMapping("/lecture/course")
    public void savelecturecourse(
            @RequestParam String title,
            @RequestParam Long instructorId,
            @RequestParam Integer capacity,
            @RequestParam
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate from,
            @RequestParam
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate to,
            @RequestParam String desc) {

        // Create and save the LectureCourse object here
        LectureCourse course = new LectureCourse();
        course.setTitle(title);
        course.setInstructorId(instructorId);
        course.setCapacity(capacity);
        course.setFrom(from);
        course.setTo(to);
        course.setDesc(desc);
        lectureCourseRepository.save(course);
    }
}
