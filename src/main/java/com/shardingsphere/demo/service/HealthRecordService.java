package com.shardingsphere.demo.service;

import java.sql.SQLException;

/**
 * @author lzn
 */
public interface HealthRecordService {
	
	/**
	 * processHealthRecords
	 *
	 * @throws SQLException
	 */
	void processHealthRecords() throws SQLException;

}
