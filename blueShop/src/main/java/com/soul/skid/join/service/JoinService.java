package com.soul.skid.join.service;

import java.util.Map;

import com.soul.skid.join.vo.MembersVO;

public interface JoinService {

	public MembersVO selectDuplicateCheckInfo(Map<String, Object> map) throws Exception;
	
	public void insertMember(MembersVO membersVO) throws Exception;
	
}
