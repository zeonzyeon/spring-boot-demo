package com.estsoft.springdemoproject.repository;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getLong("id"));  // DB의 컬럼명에 맞춰 수정
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setDescription(rs.getString("desc"));
        student.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        return student;
    }
}
