package cn.itcast.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.mapper.UserMapper;
import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// 注入mapper
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryUserByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.queryUSerByName(name);
	}

	@Override
	public List<User> queryUsers() {
		// TODO Auto-generated method stub
		return userMapper.queryUsers();
	}

}
