package com.earthchen.weixinsell.service.impl;

import com.earthchen.weixinsell.domain.SellerInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    private static final String openid = "abc";

    @Autowired
    private SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByOpenid(){
        SellerInfo result = sellerService.findSellerInfoByOpenid(openid);
        assertEquals(openid, result.getOpenid());
    }
}