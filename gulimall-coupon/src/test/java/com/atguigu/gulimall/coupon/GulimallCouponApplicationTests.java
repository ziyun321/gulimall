package com.atguigu.gulimall.coupon;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;
import com.atguigu.gulimall.coupon.service.CouponHistoryService;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponHistoryService couponHistoryService;
    @Test
    void contextLoads() {
        List<CouponHistoryEntity> list = couponHistoryService.list();
        System.out.println(list.toString());

    }

}
