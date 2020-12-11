package com.shardingsphere.demo.hint.tools;

import org.apache.shardingsphere.api.hint.HintManager;

/**
 * 通过使用 HintManager 开放的 setDatabaseShardingValue 来完成数据库分片值的设置
 *
 * @author lzn
 */
public class HintManagerHelper {
	
	public static void initializeHintManagerForShardingDatabasesAndTables(final HintManager hintManager) {
		hintManager.addDatabaseShardingValue("health_record", 3L);
		hintManager.addTableShardingValue("health_record", 2L);
	}
	
	public static void initializeHintManagerForShardingDatabases(final HintManager hintManager) {
		hintManager.setDatabaseShardingValue(1L);
	}
	
	public static void initializeHintManagerForMaster(final HintManager hintManager) {
		hintManager.setMasterRouteOnly();
	}
}
