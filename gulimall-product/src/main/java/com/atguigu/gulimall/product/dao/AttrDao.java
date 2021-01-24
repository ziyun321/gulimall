package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author ziyun
 * @email ziyun_9@163.com
 * @date 2021-01-16 22:26:42
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
