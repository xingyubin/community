package com.newcoder.community.community.dao;

import com.newcoder.community.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.jws.soap.SOAPBinding;

/**
 * @author xyb
 * @create 2022-06-11 19:23
 */
@Mapper
public interface UserMapper {


    User selectById(int id);


}
