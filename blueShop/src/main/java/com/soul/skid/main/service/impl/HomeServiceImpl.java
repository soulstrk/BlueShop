package com.soul.skid.main.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soul.skid.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Resource
	private HomeMapper homeMapper;

	@Override
	public List<Map<String, Object>> selectMainServiceList() throws Exception {
		return homeMapper.selectMainServiceList();
	}
	
}
