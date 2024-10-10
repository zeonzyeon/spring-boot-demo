package com.estsoft.springdemoproject.repository;

import com.estsoft.springdemoproject.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class JdbcStudentRepository {

    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public JdbcStudentRepository(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    // 학생 이름 목록 조회
    public List<String> selectStudentNameList() {
        return jdbcTemplate.queryForList("SELECT name FROM student", String.class);
    }

    // 학생 이름과 나이를 기반으로 조회 (JdbcTemplate 사용)
    public Map<String, Object> selectStudentName(String name, Integer age) {
        return jdbcTemplate.queryForMap("SELECT name FROM student WHERE name = ? AND age > ?", name, age);
    }

    // 학생 이름과 나이를 기반으로 조회 (NamedParameterJdbcTemplate 사용)
    public List<Map<String, Object>> selectStudentName2(String name, Integer age) {
        return namedParameterJdbcTemplate.queryForList(
                "SELECT name FROM student WHERE name = :name AND age > :age",
                new MapSqlParameterSource().addValue("name", name).addValue("age", age)
        );
    }

    // 강사 이름 목록 조회
    public List<String> selectInstructorNameList() {
        return jdbcTemplate.queryForList("SELECT name FROM instructor", String.class);
    }

    // 학생 ID로 조회 (Optional<Student> 반환)
    public Optional<Student> findById(Long id) {
        String sql = "SELECT * FROM student WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource("id", id);

        List<Student> students = namedParameterJdbcTemplate.query(sql, params, new StudentRowMapper());

        if (students.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(students.get(0));
        }
    }

    // 학생 정보를 저장하는 메서드
    public void save(Student student) {
        String sql = "INSERT INTO student (name, age, desc) VALUES (:name, :age, :desc)";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", student.getName());
        params.addValue("age", student.getAge());
        params.addValue("desc", student.getDesc());

        namedParameterJdbcTemplate.update(sql, params);
    }
}
