package com.newcoder.community.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * @author xyb
 * @create 2022-06-15 13:01
 */
//@Configuration
//public class MailConfiguration {
//    @Bean
//    public JavaMailSender getJavaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.sina.com");
//        mailSender.setPort(465);
//
//        mailSender.setUsername("xingyb1997@sina.com");
//        mailSender.setPassword("5d3d9f7117a1abd4");
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.ssl.enable", "true");
//        return mailSender;
//    }
//}
