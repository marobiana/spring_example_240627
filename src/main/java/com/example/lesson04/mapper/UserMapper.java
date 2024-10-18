package com.example.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson04.domain.User;

@Mapper
public interface UserMapper {

	// input:4개 파라미터
	// output:X
	public void insertUser(
			@Param("name") String name, 
			@Param("yyyymmdd") String yyyymmdd, 
			@Param("email") String email, 
			@Param("introduce") String introduce);
	
	// input: X
	// output: User or null
	public User selectLatestUser();
	
	// input: name
	// output: boolean t:중복   f:중복x
	public boolean isDuplicatedName(String name);
}






