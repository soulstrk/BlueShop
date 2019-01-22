package com.soul.skid.main.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {

	List<Map<String, Object>> selectMainServiceList() throws Exception;
	
}
