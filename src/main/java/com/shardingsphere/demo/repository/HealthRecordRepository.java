package com.shardingsphere.demo.repository;

import com.shardingsphere.demo.entity.HealthRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzn
 */
@Mapper
public interface HealthRecordRepository extends BaseRepository<HealthRecord, Long> {

}
