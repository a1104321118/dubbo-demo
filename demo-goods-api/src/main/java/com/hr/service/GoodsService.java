package com.hr.service;

import com.hr.model.Goods;
import com.hr.model.User;

/**
 * @author hr
 * @date 2017年3月22日
 */
public interface GoodsService {
	
	Goods selectGoodsById(Integer id);
	
	User  selectById(Integer id);
}
