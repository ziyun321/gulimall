package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author ziyun
 * @email ziyun_9@163.com
 * @date 2021-01-18 21:53:34
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
