package com.demo.dao;

import com.demo.model.MyUser;

public interface LeaveDao {

	MyUser checkUser(String unm, String passwd);

}
