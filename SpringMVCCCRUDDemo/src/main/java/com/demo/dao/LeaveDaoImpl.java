package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MyUser;

@Repository
public class LeaveDaoImpl implements LeaveDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
 
	

}
