package com.shardingsphere.demo;

import com.shardingsphere.demo.hint.HintService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.sql.SQLException;

/**
 * TODO
 *
 * @author lzn
 * @version 1.0
 * @date 2020/12/10 9:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class HintServiceTest {
    
    @Autowired
    private HintService hintService;
    
    @Test
    public void test() throws IOException, SQLException {
        hintService.processWithHintValueForShardingDatabases();
    }
}
