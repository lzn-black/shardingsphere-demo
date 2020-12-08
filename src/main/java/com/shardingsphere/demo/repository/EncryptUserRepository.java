package com.shardingsphere.demo.repository;

import com.shardingsphere.demo.entity.EncryptUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzn
 */
@Mapper
public interface EncryptUserRepository extends BaseRepository<EncryptUser, Long> {

}
