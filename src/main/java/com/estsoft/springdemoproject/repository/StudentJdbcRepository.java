package com.estsoft.springdemoproject.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.List;
import java.util.Map;

public class StudentJdbcRepository {

    // JdbcTemplate과 NamedParameterJdbcTemplate 변수 선언
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    // 생성자에서 의존성 주입
    public StudentJdbcRepository(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    // 학생 이름 목록 조회
    public List<String> selectStudentNameList() {
        return jdbcTemplate.queryForList("select name from student", String.class);
    }

    // 학생 이름과 나이를 기반으로 조회 (JdbcTemplate 사용)
    public Map<String, Object> selectStudentName(String name, Integer age) {
        return jdbcTemplate.queryForMap("select name from student where name = ? and age > ?", name, age);
    }

    // 학생 이름과 나이를 기반으로 조회 (NamedParameterJdbcTemplate 사용)
    public Map<String, Object> selectStudentName2(String name, Integer age) {
        return namedParameterJdbcTemplate.queryForMap(
                "select name from student where name = :name and age > :age",
                new MapSqlParameterSource().addValue("name", name).addValue("age", age)
        );
    }

    // 학생 정보 조회 (이름과 나이를 기반으로 조회, 커스텀 RowMapper 사용)
    public Student selectStudentName3(String name, Integer age) {
        return namedParameterJdbcTemplate.queryForObject(
                "SELECT * FROM student WHERE name = :name AND age > :age",
                new MapSqlParameterSource("name", name).addValue("age", age),
                new StudentRowMapper()
        );
    }

    // 강사 이름 목록 조회
    public List<String> selectInstructorNameList() {
        return jdbcTemplate.queryForList("select name from instructor", String.class);
    }
}
