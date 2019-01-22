package com.soul.skid.join.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {
	
	@RequestMapping(value="/join.do", method = RequestMethod.GET)
	public String joinInit() {
		return "join/join.tiles";
	}
}
