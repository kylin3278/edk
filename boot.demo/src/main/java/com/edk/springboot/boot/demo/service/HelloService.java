package com.edk.springboot.boot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.edk.springboot.boot.demo.dao.entity.ChRecmdUserCategory;
import com.edk.springboot.boot.demo.dao.entity.ChRecmdUserCategoryExample;
import com.edk.springboot.boot.demo.dao.mapper.ChRecmdUserCategoryMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Component
public class HelloService {

	@Autowired
	private ChRecmdUserCategoryMapper chRecmdUserCategoryMapper;
	
	public String getUserCategoryString(Integer id){
		ChRecmdUserCategory result = chRecmdUserCategoryMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(result);
	}
	
	public Page<ChRecmdUserCategory> getPage() {
		ChRecmdUserCategoryExample example = new ChRecmdUserCategoryExample();
		example.createCriteria().andCategory1idIsNotNull();
		PageHelper.startPage(1, 10);
		List<ChRecmdUserCategory> list = chRecmdUserCategoryMapper.selectByExample(example);
		Page<ChRecmdUserCategory> page = (Page<ChRecmdUserCategory>) list;
		return page;
	}

}
