package com.soul.skid.join.service.impl;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.soul.skid.join.vo.MembersVO;

@Mapper
public interface JoinMapper {
	
	public MembersVO selectDuplicateCheckInfo(Map<String, Object> map) throws Exception;
	
	public void insertMember(MembersVO membersVO) throws Exception;
	
}
