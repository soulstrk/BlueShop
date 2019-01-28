package com.soul.skid.join.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soul.skid.join.service.JoinService;
import com.soul.skid.join.vo.MembersVO;

@Service
public class JoinServiceImpl implements JoinService{
	
	@Resource
	private JoinMapper joinMapper;
	
	public MembersVO selectDuplicateCheckInfo(Map<String, Object> map) throws Exception {
		return joinMapper.selectDuplicateCheckInfo(map);
	}
	
	public void insertMember(MembersVO membersVO) throws Exception {
		joinMapper.insertMember(membersVO);
	}
}
