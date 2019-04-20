package com.springboot.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.service.UserService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping(value = "/crud", method = { RequestMethod.GET, RequestMethod.POST })
public class CrudController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "find")
	@ResponseBody
	public List<User> listUserByName(String name){
		return userService.findByName(name);
	}
	
	@RequestMapping(value = "page")
	@ResponseBody
	public Page<User> listUserByPage(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        Page<User>  userList= userService.findByPage();
        return userList;
    }
	
	@RequestMapping(value = "list")
	@ResponseBody
	public List<User> listUser(){
		return userService.listUser();
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public User insert(User user){
		return userService.insertUser(user);
	}
	
	@RequestMapping(value="delete", method = RequestMethod.GET)
	public String delete(int id) {
		int result = userService.delete(id);
		if(result >= 1) {
			return "delete success";
		} else {
			return "delete fail";
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(User user) {
		int result = userService.update(user);
		if (result >= 1) {
			return "update success";
		} else {
			return "update fail";
		}
	}

	
}
