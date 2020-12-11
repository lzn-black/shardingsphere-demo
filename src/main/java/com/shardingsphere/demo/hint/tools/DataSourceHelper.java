package com.shardingsphere.demo.hint.tools;

import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlMasterSlaveDataSourceFactory;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;


/**
 * 通过加载 .yaml 配置文件来完成 DataSource 的构建
 *
 * @author lzn
 */
public class DataSourceHelper {
 
	public static DataSource getDataSourceForShardingDatabases() throws IOException, SQLException {
		return YamlShardingDataSourceFactory.createDataSource(getFile("/hint/hint-databases.yaml")); 
    }
    
    public static DataSource getDataSourceForShardingDatabasesAndTables() throws IOException, SQLException {
		return YamlShardingDataSourceFactory.createDataSource(getFile("/hint/hint-databases-tables.yaml"));  
    }
    
    public static DataSource getDataSourceForMaster() throws IOException, SQLException {
		return YamlMasterSlaveDataSourceFactory.createDataSource(getFile("/hint/hint-master-only.yaml"));    
    }
	
    private static File getFile(final String configFile) {
        return new File(Thread.currentThread().getClass().getResource(configFile).getFile());
    }
}
