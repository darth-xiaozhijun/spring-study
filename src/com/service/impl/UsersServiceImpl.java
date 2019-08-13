package com.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mapper.UsersMapper;
import com.pojo.Users;
import com.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Value("${my.demo}")
	private String test;
	
	@Resource
	private UsersMapper usersMapper;
	
	/*public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}*/

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
