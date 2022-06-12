package com.newcoder.community.community.service;

import com.newcoder.community.community.dao.DiscussPostMapper;
import com.newcoder.community.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xyb
 * @create 2022-06-10 14:26
 */
@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit){
        return discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }

    public int findDiscussPostRows(int userId){

        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
