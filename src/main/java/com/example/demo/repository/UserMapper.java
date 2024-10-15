package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

	/*全件検索*/
	List<User> selectAll();
	
	/* 指定されたIDのユーザーを取得*/
	User selectUserById(@Param("id") Long id);
}
