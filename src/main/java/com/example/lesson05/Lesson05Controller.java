package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {

	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("grape");
		fruits.add("peach");
		fruits.add("mango");
		model.addAttribute("fruits", fruits);
		
		// List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user1 = new HashMap<>();
		user1.put("name", "신보람");
		user1.put("age", 30);
		user1.put("hobby", "영화보기");
		users.add(user1);

		Map<String, Object> user2 = new HashMap<>();
		user2.put("name", "김송이");
		user2.put("age", 35);
		user2.put("hobby", "춤추기");
		users.add(user2);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
}





