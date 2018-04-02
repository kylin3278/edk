package com.edk.springboot.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.edk.springboot.boot.demo.domain.User;
import com.edk.springboot.boot.demo.service.HelloService;

@RestController
public class HelloWorldController {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@RequestMapping("/hello")
	public String index() {
		ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
		valueOperations.set("aaaaaa", "bbbbbb");
		return JSON.toJSONString(helloService.getPage());
		//return helloService.getUserCategoryString(38);
		// return "Hello World";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "Test";
	}
	
	@RequestMapping("/getUser")
    public User getUser() {
    	User user=new User();
    	user.setName("小明");
    	user.setPassword("66666");
        return user;
    }
	
}
