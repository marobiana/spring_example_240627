package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // 클래스에 있는 패스를 먼저 읽어 들인다.
@Controller // Spring bean 등록
public class Lesson01Ex01Controller {

	// http://localhost:8080/lesson01/ex01/1
	// String을 브라우저에 출력
	@ResponseBody // 리턴되는 String은 Response body에 넣어지고 HTML 응답
	@RequestMapping("/1")
	public String ex01_1() {
		return "<h2>문자열을 ResponseBody에 보내는 예제</h2>";
	}
	
	// http://localhost:8080/lesson01/ex01/2
	// map 리턴 => JSON String
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("딸기", 3);
		map.put("파인애플", 20);
		map.put("포도", 51);
		
		// map을 리턴하면 JSON String이 된다.
		// web starter에 jackson 라이브러리가 있기 때문
		return map;
	}
}





