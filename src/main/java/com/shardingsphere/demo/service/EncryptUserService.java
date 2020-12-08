package com.shardingsphere.demo.service;

import com.shardingsphere.demo.entity.EncryptUser;

import java.sql.SQLException;
import java.util.List;

public interface EncryptUserService {
	
	public void processEncryptUsers() throws SQLException;
	
	public List<EncryptUser> getEncryptUsers() throws SQLException;

}
