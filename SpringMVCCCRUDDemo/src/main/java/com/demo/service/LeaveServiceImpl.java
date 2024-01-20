package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LeaveDao;
import com.demo.model.MyUser;

@Service
public class LeaveServiceImpl implements LeaveService{
	@Autowired
	private LeaveDao ldao;

	

}
