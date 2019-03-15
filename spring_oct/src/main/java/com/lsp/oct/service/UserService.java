package com.lsp.oct.service;

import org.springframework.stereotype.Service;

import com.lsp.oct.entity.User;


public interface UserService {

	public User findUserById(int id);
}
