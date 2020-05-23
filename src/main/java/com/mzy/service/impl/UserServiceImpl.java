package com.mzy.service.impl;

import com.mzy.entity.Passenger;
import com.mzy.entity.User;
import com.mzy.mapper.PassengerMapper;
import com.mzy.mapper.UserMapper;
import com.mzy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mzy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
     @Autowired
    UserMapper userMapper;
     @Autowired
    PassengerMapper passengerMapper;
     public UserVO userToVO(String id){//TODO
         User user=userMapper.selectById(id);
         UserVO userVO=new UserVO(1);
         return userVO;
     }
}
