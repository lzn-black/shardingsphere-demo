package com.shardingsphere.demo;

import com.shardingsphere.demo.service.HealthLevelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class HealthLevelServiceTest {

	@Autowired
	private HealthLevelService healthLevelService;
	
	@Test
	public void testProcess() throws Exception {
		healthLevelService.processLevels();
	}
}
