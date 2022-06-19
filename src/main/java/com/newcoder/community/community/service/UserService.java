package com.newcoder.community.community.service;

import com.newcoder.community.community.dao.UserMapper;
import com.newcoder.community.community.entity.User;
import com.newcoder.community.community.util.MailClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

/**
 * @author xyb
 * @create 2022-06-11 19:14
 */
@Service
public class UserService {

        @Autowired
        private UserMapper userMapper;

        @Autowired
        private MailClient mailClient;

        @Autowired
        private TemplateEngine templateEngine;

        @Value("${server.servlet.context-path}")
        private String contextPath;

        @Value("${community.path.domain}")
        private String domain;

        public User findUserById(int id){
                return userMapper.selectById(id);
        }




}
