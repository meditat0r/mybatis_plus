package com.kuang.service.impl;

import com.kuang.pojo.User;
import com.kuang.mapper.UserMapper;
import com.kuang.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author meditat0r
 * @since 2021-11-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
