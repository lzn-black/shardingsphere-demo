package com.shardingsphere.demo.repository;

import com.shardingsphere.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzn
 */
@Mapper
public interface UserRepository extends BaseRepository<User, Long> {

}
