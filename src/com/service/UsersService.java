package com.service;

import com.pojo.Users;

public interface UsersService {
	
	/**
	 * 登录
	 * @param users
	 * @return
	 */
	Users login(Users users);
	
	int insert(Users users);
	
	int insUsers(Users users);
	
	int updUsers(Users users) throws Exception;
}
