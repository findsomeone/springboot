package com.itrigger.springboot.IDao;

import org.apache.ibatis.annotations.Mapper;

import com.itrigger.springboot.domain.Area;

@Mapper
public interface AreaMapper {
    int deleteByPrimaryKey(String code);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}