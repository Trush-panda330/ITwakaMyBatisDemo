package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Long id;
	
	private String name;
	
	private String address;
	
	private String phone;
	
	private LocalDateTime createDate;
	
	private LocalDateTime updateDate;
	
	private LocalDateTime deleteDate;
}
