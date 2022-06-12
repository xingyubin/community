package com.newcoder.community.community.service;

import com.newcoder.community.community.dao.UserMapper;
import com.newcoder.community.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xyb
 * @create 2022-06-11 19:14
 */
@Service
public class UserService {

        @Autowired
        private UserMapper userMapper;

        public User findUserById(int id){
                return userMapper.selectById(id);
        }




}
