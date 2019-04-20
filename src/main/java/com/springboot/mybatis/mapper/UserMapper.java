package com.springboot.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;
import com.springboot.mybatis.entity.User;

@Mapper
public interface UserMapper {

	List<User> findUserByName(String name);
	
	public List<User> listUser();
	
	public int insertUser(User user);
	
	public int delete(int id);
	
	public int update(User user);

	Page<User> findByPage();
	
}
