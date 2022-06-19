package com.newcoder.community.community.util;

import org.springframework.util.DigestUtils;
import org.thymeleaf.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * @author xyb
 * @create 2022-06-16 13:47
 */
public class CommunityUtil {

    /**
     * 生成随机字符串
     * @return
     */
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }


    /**
     * 对用户密码进行md5加密
     * @param key
     * @return
     */
    public static String md5(String key){
        if(StringUtils.isEmpty(key)){
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }


    
}
