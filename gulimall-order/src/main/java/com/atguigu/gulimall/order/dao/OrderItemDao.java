package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ziyun
 * @email ziyun_9@163.com
 * @date 2021-01-18 21:50:13
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
