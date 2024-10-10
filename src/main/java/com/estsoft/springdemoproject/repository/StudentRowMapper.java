package com.estsoft.springdemoproject.repository;

import com.estsoft.springdemoproject.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getLong("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setDesc(rs.getString("desc"));
        return student;
    }
}
