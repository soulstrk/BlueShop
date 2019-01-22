package com.soul.skid.main.web;

import java.util.List;
import java.util.Map;

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
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String home(Model model) throws Exception{
		List<Map<String, Object>> list = homeService.selectMainServiceList();
		
		System.out.println(list);
		
		return "main/main.tiles";
	}
	
}
