package com.cts.training.dao;

import com.cts.training.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    final String INSERT_QUERY;
    final String FIND_ALL;
    final String FIND_ONE;

    {
        INSERT_QUERY = "INSERT INTO CUSTOMERS (ID, FULL_NAME, EMAIL, LOGIN_PASSWORD, CREATED_DATE) " +
                "VALUES (?, ?, ?, ?, ?)";
        FIND_ALL = "SELECT * FROM CUSTOMERS";
        FIND_ONE = "SELECT * FROM CUSTOMERS WHERE ID = ?";
    }

    @Override
    public int insert(Customer c) {
        return jdbcTemplate.update(INSERT_QUERY, c.getId(), c.getFullName(),
                c.getEmail(), c.getPassword(), c.getDate());
    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query(FIND_ALL, this::mapRowToCustomer);
    }

    @Override
    public Customer findById(int id) {
        return jdbcTemplate.queryForObject(FIND_ONE, this::mapRowToCustomer, id);
    }

//    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/RowMapper.html
//    RowMapper is functional interface
    private Customer mapRowToCustomer(ResultSet rs, int rowNum) throws SQLException{
        return  Customer.builder()
                .id(rs.getInt(1))
                .fullName(rs.getString(2))
                .email(rs.getString(3))
                .password(rs.getString(4))
                .date(rs.getDate(5).toLocalDate())
                .build();
    }
}
