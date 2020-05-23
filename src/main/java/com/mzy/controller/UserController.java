package com.mzy.controller;


import com.mzy.mapper.UserMapper;
import com.mzy.service.impl.UserServiceImpl;
import com.mzy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@RestController
@RequestMapping
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @GetMapping("/user/findById/{user_id}")
    UserVO findUserById(@PathVariable String user_id){
      UserVO userVO=userService.userToVO(user_id);
      return userVO;
    }
}

