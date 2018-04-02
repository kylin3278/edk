package com.edk.springboot.boot.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edk.springboot.boot.demo.dao.entity.ChRecmdUserCategory;
import com.edk.springboot.boot.demo.dao.mapper.ChRecmdUserCategoryMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Resource
	private ChRecmdUserCategoryMapper chRecmdUserCategoryMapper;
	
	@Test
	public void addTest(){
		ChRecmdUserCategory userCategory = new ChRecmdUserCategory();
		userCategory.setUserId(1);
		userCategory.setCategory1id(1);
		userCategory.setCategory2id(1);
		userCategory.setCategory3id(1);
		userCategory.setCreateTime(222222);
		chRecmdUserCategoryMapper.insert(userCategory);
	}

}
