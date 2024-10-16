package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

public interface UserService {
	
	/*
	 * 全ユーザーの検索
	 * */
	List<User> selectAllUser();
	
	/**
	 * @Param userSearchRequest
	 * @return 検索結果
	 * */
	User searchByIdUser(UserSearchRequest userSearchRequest);

}
