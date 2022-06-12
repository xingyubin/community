package com.newcoder.community.community.controller;

import com.newcoder.community.community.entity.DiscussPost;
import com.newcoder.community.community.entity.Page;
import com.newcoder.community.community.entity.User;
import com.newcoder.community.community.service.DiscussPostService;
import com.newcoder.community.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xyb
 * @create 2022-06-11 19:34
 */
@Controller
public class HomeController {

    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){
        page.setRows(discussPostService.findDiscussPostRows(0));
        page.setPath("/index");
        List<DiscussPost> postList = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> discussPosts = new ArrayList();
        if(postList != null){
            for (DiscussPost discussPost : postList) {
                Map<String,Object> map = new HashMap<>();
                map.put("discussPost",discussPost);
                User user = userService.findUserById(discussPost.getUserId());
                map.put("user",user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts",discussPosts);
        return "/index";
    }




}
