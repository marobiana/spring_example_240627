package com.example.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson04.domain.Student;

@Mapper
public interface StudentMapper {

	// input: Student
	// output: int or void
	public void insertStudent(Student student);
}





