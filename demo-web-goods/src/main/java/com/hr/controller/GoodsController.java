package com.hr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hr.model.Goods;
import com.hr.service.GoodsService;

/**
 * @author hr
 * @date 2017年3月22日
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsService  goodsService;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("select")
	@ResponseBody
	public JSONObject select(){
		JSONObject result = new JSONObject();
		String id = request.getParameter("id");
		
		Goods goods= goodsService.selectGoodsById(Integer.valueOf(id));
		
		result.put("goods", goods);
		
		return result;
	}
}
