package com.newcoder.community.community;

import com.newcoder.community.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author xyb
 * @create 2022-06-15 13:55
 */
@SpringBootTest
public class MailTest {
    @Autowired
    private MailClient mailClient;

    @Test
    public void testMailC(){
        mailClient.sendMail("740863116@qq.com","mailtest","hello world");
    }
}
