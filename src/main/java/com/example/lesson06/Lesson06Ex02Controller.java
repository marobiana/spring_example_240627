package com.example.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson06/ex02")
@Controller
public class Lesson06Ex02Controller {

	// 회원가입 화면
	// /sign-up-view
	@GetMapping("/sign-up-view")
	public String signUpView() {
		return "lesson06/signUp";
	}
	
	// AJAX 요청
	@ResponseBody
	@GetMapping("/is-duplicated-name")
	public Map<String, Object> isDuplicatedName(
			@RequestParam("name") String name) {
		
		// DB select
		
		// 응답값 => Map => JSON String
		// {"code":200, "is_duplicated_name":true}
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("is_duplicated_name", true);
		return result;
	}
}




