package com.lsp.oct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsp.oct.dao.UserMapper;
import com.lsp.oct.entity.User;
import com.lsp.oct.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUserById(int id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

}
