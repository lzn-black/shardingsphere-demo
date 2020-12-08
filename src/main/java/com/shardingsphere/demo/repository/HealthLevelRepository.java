package com.shardingsphere.demo.repository;

import com.shardingsphere.demo.entity.HealthLevel;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzn
 */
@Mapper
public interface HealthLevelRepository extends BaseRepository<HealthLevel, Long> {

}
