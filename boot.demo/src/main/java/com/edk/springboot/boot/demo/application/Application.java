package com.edk.springboot.boot.demo.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.edk.springboot.boot.demo.dao.mapper")
@ComponentScan({"com.edk.springboot.boot.demo"})
@EnableTransactionManagement
@EnableCaching
public class Application {

	public static void main(String[] args) {
		// use Application packageName as basePackageScan
		SpringApplication.run(Application.class, args);
	}
	
}
