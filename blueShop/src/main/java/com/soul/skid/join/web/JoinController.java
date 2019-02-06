package com.soul.skid.join.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soul.skid.core.constant.CommonConstant;
import com.soul.skid.join.service.JoinService;
import com.soul.skid.join.vo.MembersVO;

@Controller
public class JoinController {
	
	@Resource
	private JoinService joinService;
	
	@RequestMapping(value="/main/join.do", method = RequestMethod.GET)
	public String joinInit() {
		return "join/join";
	}
	
	/**
	 * @Description 회원가입 처리
	 * @param membersVO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/main/join.do", method = RequestMethod.POST)
	public String joinInsertMember(MembersVO membersVO) throws Exception{
		
		if (membersVO != null) {
			joinService.insertMember(membersVO);
		}
		
		return "join/join";
	}
	
	/**
	 * @Description 아이디 중복체크
	 * @param mbId
	 * @return
	 */
	@RequestMapping(value="/main/idCheck-proc.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> idCheck(@RequestParam(required=true) String mbId) {
		
		System.out.println(mbId);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			if (mbId != null && !mbId.equals("")) {
				map.put("column", "mb_id");
				map.put("val", mbId);
				
				MembersVO membersVO = joinService.selectDuplicateCheckInfo(map);
				
				
				if (membersVO == null) {
					map.put("resultCode", CommonConstant.getResultSuccess());
				} else {
					map.put("resultCode", CommonConstant.getResultFail());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.put("error", CommonConstant.getError());
		}
		
		return map;
	}
	
	/**
	 * @Description 이메일 중복체크
	 * @param email
	 * @return
	 */
	@RequestMapping(value="/main/emailCheck-proc.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> emailCheck(@RequestParam(required=true) String email) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			if (email != null && email.equals("")) {
				map.put("column", "email");
				map.put("val", email);
				
				MembersVO membersVO = joinService.selectDuplicateCheckInfo(map);
				
				if (membersVO == null) {
					map.put("resultCode", CommonConstant.getResultSuccess());
				} else {
					map.put("resultCode", CommonConstant.getResultFail());
				}
			}
		} catch (Exception e) {
			map.put("error", CommonConstant.getError());
		}
		
		return map;
	}
}








