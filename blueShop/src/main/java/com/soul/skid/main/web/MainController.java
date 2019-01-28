package com.soul.skid.main.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soul.skid.main.service.HomeService;

@Controller
public class MainController {
	
	@Resource
	private HomeService homeService;
	
	@RequestMapping(value = "/main/main.do", method = RequestMethod.GET)
	public String homeInit(Model model) throws Exception{
		return "main/main";
	}
	
}
