package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserMapper userMapper;
	
	@Override
	public List<User> selectAllUser() {
		return userMapper.selectAll();
	}

	@Override
	public User searchByIdUser(UserSearchRequest userSearchRequest) {
		return userMapper.searchByIdUser(userSearchRequest);
	}

}
