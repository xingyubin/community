package com.newcoder.community.community;

import com.newcoder.community.community.dao.DiscussPostMapper;
import com.newcoder.community.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author xyb
 * @create 2022-06-09 23:18
 */
@SpringBootTest
public class MapperTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void discusspostSelectTest(){
        int i = discussPostMapper.selectDiscussPostRows(1);
        System.out.println(i);
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(101, 2, 10);
        System.out.println(discussPosts.size());
    }
}
