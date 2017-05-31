package com.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.GoodsMapper;
import com.hr.model.Goods;
import com.hr.model.User;
import com.hr.service.GoodsService;
import com.hr.service.UserService;

/**
 * @author hr
 * @date 2017年3月22日
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper	goodsMapper;//测试作为提供方
	@Autowired
	private UserService	userService;//测试作为消费方

	@Override
	public Goods selectGoodsById(Integer id) {
		return goodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public User selectById(Integer id) {
		return userService.selectByUserId(id);
	}
	
	

}
