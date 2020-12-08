package com.shardingsphere.demo.service;

import com.shardingsphere.demo.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
	
	public void processUsers() throws SQLException;
	
	public List<User> getUsers() throws SQLException;

}
