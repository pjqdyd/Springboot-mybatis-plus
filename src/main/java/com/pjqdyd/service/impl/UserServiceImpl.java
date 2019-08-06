package com.pjqdyd.service.impl;

import com.pjqdyd.entity.User;
import com.pjqdyd.mapper.UserMapper;
import com.pjqdyd.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pjqdyd
 * @since 2019-08-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
