package com.cts.training.repository;

import com.cts.training.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@Repository
@Slf4j
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    final String INSERT_QUERY = "INSERT INTO STUDENTS VALUES (?, ?, ?, ?)";
    final String FIND_ALL_QUERY = "SELECT * FROM STUDENTS";

    @Override
    public int create(Student student) {
        log.info("DAO - inside create() in " + this.getClass().getName());
        return jdbcTemplate.update(INSERT_QUERY,
                            student.getId(),student.getName(),
                            student.getEmail(), LocalDate.now());
    }

    @Override
    public List<Student> readAll() {
        log.info("DAO - inside readAll() in " + this.getClass().getName());
        BeanPropertyRowMapper rowMapper = BeanPropertyRowMapper.newInstance(Student.class);
        return jdbcTemplate.query(FIND_ALL_QUERY, rowMapper);
    }

    private Student mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        return Student.builder()
                .id(resultSet.getInt(1))
                .name(resultSet.getString(2))
                .email(resultSet.getString(3))
                .joinDate(resultSet.getDate(4).toLocalDate())
                .build();
    }
}
