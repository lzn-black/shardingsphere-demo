package com.shardingsphere.demo.service.impl;

import com.shardingsphere.demo.entity.HealthLevel;
import com.shardingsphere.demo.repository.HealthLevelRepository;
import com.shardingsphere.demo.service.HealthLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @author lzn
 */
@Service
public class HealthLevelServiceImpl implements HealthLevelService {

	@Autowired
	private HealthLevelRepository healthLevelRepository;
	
	@Override
	public void processLevels() throws SQLException {
		healthLevelRepository.addEntity(new HealthLevel(1L, "level1"));
		healthLevelRepository.addEntity(new HealthLevel(2L, "level2"));
		healthLevelRepository.addEntity(new HealthLevel(3L, "level3"));
		healthLevelRepository.addEntity(new HealthLevel(4L, "level4"));
		healthLevelRepository.addEntity(new HealthLevel(5L, "level5"));
	}
}
