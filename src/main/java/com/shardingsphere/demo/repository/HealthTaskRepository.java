package com.shardingsphere.demo.repository;

import com.shardingsphere.demo.entity.HealthTask;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzn
 */
@Mapper
public interface HealthTaskRepository extends BaseRepository<HealthTask, Long> {

}
