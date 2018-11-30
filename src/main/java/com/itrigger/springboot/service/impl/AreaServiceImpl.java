package com.itrigger.springboot.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itrigger.springboot.IDao.AreaMapper;
import com.itrigger.springboot.domain.Area;
import com.itrigger.springboot.service.AreaService;

@Service("AreaService")
public class AreaServiceImpl implements AreaService{
	
	@Resource AreaMapper areaMapper;

	public Area getAreaById(String code) {
		return areaMapper.selectByPrimaryKey(code);
	}

}
