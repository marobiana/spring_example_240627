package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson04/ex01")
@Controller // HTML 경로일 때는 @ResponseBody가 없다
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;

	// 회원가입 화면
	// http://localhost/lesson04/ex01/add-user-view
	@RequestMapping(path = "/add-user-view", method = RequestMethod.GET)
	public String addUserView() {
		return "lesson04/addUser"; // HTML의 경로
	}
	
	// 회원가입 데이터 DB insert => 결과 화면 이동
	@PostMapping("/add-user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value = "introduce", required = false) String introduce) {
		
		// DB insert
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		// 결과 화면 이동
		return "lesson04/afterAddUser";
	}
	
	// 최신 가입자 정보 화면
	// http://localhost/lesson04/ex01/latest-user-view
	@GetMapping("/latest-user-view")
	public String latestUserView() {
		// DB select
		
		// Model 데이터를 집어넣는다.
		
		return "lesson04/latestUser"; // view 경로
	}
}




