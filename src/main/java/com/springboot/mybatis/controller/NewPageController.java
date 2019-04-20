package com.springboot.mybatis.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping(value = "/api/test", method = { RequestMethod.GET, RequestMethod.POST })
public class NewPageController {
	
	@RequestMapping(value = "user")
	@ResponseBody
	public Map<String, Object> user(String a, String b) {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", "张三");
        map.put("age", 18);
        map.put("studentNo", "111111111111");
        map.put("sex", "男");
        System.out.println("=========get reqeust======");
        return map;
    }
}
