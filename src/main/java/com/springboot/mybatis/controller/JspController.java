package com.springboot.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/jsp", method = { RequestMethod.GET, RequestMethod.POST })
public class JspController {

	@RequestMapping(value = "index")
	public String listWebTest(ModelMap model){
		model.addAttribute("host", "Spring test");
		return "index";
	}
}
