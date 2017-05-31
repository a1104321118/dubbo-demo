package com.hr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hr.model.User;
import com.hr.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService	userService;
	@Autowired
	private HttpServletRequest	request;
	@Autowired
	private HttpServletResponse	response;
	
	@RequestMapping("/select")
	public @ResponseBody JSONObject selectById(){
		JSONObject result = new JSONObject();
		String id = request.getParameter("id");
		User u = userService.selectByUserId(6);
		result.put("user", u);
		return result;
	}
}
