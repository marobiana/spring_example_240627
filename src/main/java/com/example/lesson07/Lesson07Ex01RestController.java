package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex01")
@RestController
public class Lesson07Ex01RestController {

	@Autowired
	private StudentBO studentBO;
	
	// C: create
	@GetMapping("/create")
	public StudentEntity create() {
		String name = "조경아";
		String phoneNumber = "010-1122-2354";
		String email = "jka@naver.com";
		String dreamJob = "강사";
		
		// save 된 객체를 리턴하므로 id가 채워져있다.
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
	}
	
	// U:update
	@GetMapping("/update")
	public StudentEntity update() {
		// id가 5인 dreamJob을 디자이너로 변경
		return studentBO.updateStudentDreamJobById(5, "디자이너");
	}
	
	// D:delete
	@GetMapping("/delete")
	public String delete() {
		// id 4번 삭제
		studentBO.deleteStudentById(4);
		return "삭제 완료";
	}
}




