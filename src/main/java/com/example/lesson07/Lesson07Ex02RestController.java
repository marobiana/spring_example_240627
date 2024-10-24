package com.example.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@RequestMapping("/lesson07/ex02")
@RestController
public class Lesson07Ex02RestController {

	// 이번에만 BO 생략
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/select1")
	public List<StudentEntity> select1() {
		// 1) 전체 조회
		//return studentRepository.findAll();
		
		// 2) id 기준 내림차순 전체 조회
		//return studentRepository.findAllByOrderByIdDesc();
		
		// 3) id 기준 내림차순 3개 행 조회
		//return studentRepository.findTop3ByOrderByIdDesc();
		
		// 4) 이름이 "신보람"인 데이터 조회
		//return studentRepository.findByName("신보람");
		
		// 5) in문으로 일치하는 이름 값 모두 조회
		// 유재석 김바다
		//return studentRepository.findByNameIn(List.of("유재석", "김바다"));
		
		// 6) 여러 컬럼값과 일치하는 데이터 조회
		// 이름: 신보람, 장래희망: 디자이너
		//return studentRepository.findByNameAndDreamJob("신보람", "디자이너");
		
		// 7) email에 "naver" 포함된 데이터 조회 - like문 %naver%
		//return studentRepository.findByEmailContains("naver");
		
		// 8) 이름이 "김"으로 시작하는 데이터 조회 - like문 김%
		//return studentRepository.findByNameStartingWith("김");
		
		// 9) id 2 ~ 6 조회    between
		return studentRepository.findByIdBetween(2, 6);
	}
}


