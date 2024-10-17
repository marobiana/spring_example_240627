package com.example.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson06/ex01")
@Controller
public class Lesson06Ex01Controller {

	// 회원가입 화면
	// http://localhost/lesson06/ex01/add-user-view
	@GetMapping("/add-user-view")
	public String addUserView() {
		return "lesson06/addUser1";
	}
	
	// 가입 완료 화면
	// http://localhost/lesson06/ex01/after-add-user-view
}
