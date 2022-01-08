package com.kuang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author meditat0r
 * @create 2021/11/29 15:01
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
