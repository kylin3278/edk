package com.edk.springboot.boot.demo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.edk.springboot.boot.demo.dao.entity.ChRecmdUserCategory;
import com.edk.springboot.boot.demo.dao.entity.ChRecmdUserCategoryExample;

public interface ChRecmdUserCategoryMapper {
    int countByExample(ChRecmdUserCategoryExample example);

    int deleteByExample(ChRecmdUserCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChRecmdUserCategory record);

    int insertSelective(ChRecmdUserCategory record);

    List<ChRecmdUserCategory> selectByExample(ChRecmdUserCategoryExample example);

    ChRecmdUserCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChRecmdUserCategory record, @Param("example") ChRecmdUserCategoryExample example);

    int updateByExample(@Param("record") ChRecmdUserCategory record, @Param("example") ChRecmdUserCategoryExample example);

    int updateByPrimaryKeySelective(ChRecmdUserCategory record);

    int updateByPrimaryKey(ChRecmdUserCategory record);
}