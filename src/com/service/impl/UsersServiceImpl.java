package com.service.impl;

import org.springframework.beans.factory.annotation.Value;

import com.mapper.UsersMapper;
import com.pojo.Users;
import com.service.UsersService;

public class UsersServiceImpl implements UsersService {
	
	@Value("${my.demo}")
	private String test;
	
	private UsersMapper usersMapper;
	
	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	@Override
	public Users login(Users users) {
		System.out.println(test);
		return usersMapper.selByUsersPwd(users);
	}

	@Override
	public int insert(Users users) {
		return 0;
	}

	@Override
	public int insUsers(Users users) {
		System.out.println("dsfasd");
		insert(users);
		System.out.println("werqsd");
		return 0;
	}

	@Override
	public int updUsers(Users users) throws Exception {
		insert(users);
		throw new Exception();
	}

}
