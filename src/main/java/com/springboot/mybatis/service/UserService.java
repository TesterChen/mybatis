package com.springboot.mybatis.service;

import java.util.List;
import com.github.pagehelper.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> findByName(String name){
		return userMapper.findUserByName(name);
	}
	
	public Page<User> findByPage(){
		return userMapper.findByPage();
	}
	
	public User insertUser(User user) {
		userMapper.insertUser(user);
		return user;
	}
	
	public List<User> listUser(){
		return userMapper.listUser();
	}
	
	public int update(User user) {
		return userMapper.update(user);
	}
	
	public int delete(int id) {
		return userMapper.delete(id);
	}
}
