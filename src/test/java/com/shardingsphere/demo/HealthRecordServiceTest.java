package com.shardingsphere.demo;

import com.shardingsphere.demo.service.HealthRecordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class HealthRecordServiceTest {

	@Autowired
	private HealthRecordService healthRecordService;
	
	@Test
	public void testProcess() throws Exception {
		healthRecordService.processHealthRecords();
	}
}
