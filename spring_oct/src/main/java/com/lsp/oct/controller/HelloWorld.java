package com.lsp.oct.controller;


import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.lsp.oct.service.UserService;

@RestController
public class HelloWorld {

	private static final Logger logger=LoggerFactory.getLogger(HelloWorld.class);
	
	@Autowired
	private UserService userService;
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping(value="/user/{id}")
	public Object testFastJson(@PathVariable("id")int id) {
		return userService.findUserById(id);
	}
	
	@RequestMapping(value="/selectList")
	public Object testList() {
		PageHelper pageHelper = new PageHelper();
		pageHelper.startPage(1, 5);
		return null;
	}
	
	
}
