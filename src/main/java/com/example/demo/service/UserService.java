package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	
	/*
	 * 全ユーザーの検索
	 * */
	List<User> selectAllUser();
	
	/**
	 * 指定したIDのユーザーを検索*/
	User findUserById(Long id);

}
