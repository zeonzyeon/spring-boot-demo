package com.estsoft.springdemoproject.repository;

import com.estsoft.springdemoproject.entity.LectureCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureCourseRepository extends JpaRepository<LectureCourse, Long> {

}
