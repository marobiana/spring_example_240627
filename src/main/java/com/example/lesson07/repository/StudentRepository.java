package com.example.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lesson07.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	// 순수한 JPA vs Spring Data JPA
	// public StudentEntity save(StudentEntity studentEntity);
	// public Optional<StudentEntity> findById(int id);
	// public void delete(StudentEntity studentEntity);
	
	// 조회
	//public List<StudentEntity> findAll();
	
	// ex02/select1 => JPQL 메소드 
	public List<StudentEntity> findAllByOrderByIdDesc();
	public List<StudentEntity> findTop3ByOrderByIdDesc();
	public List<StudentEntity> findByName(String name);
	public List<StudentEntity> findByNameIn(List<String> names);
	public List<StudentEntity> findByNameAndDreamJob(String name1, String dreamJob222);
	public List<StudentEntity> findByEmailContains(String keyword);
	public List<StudentEntity> findByNameStartingWith(String keyword);
	public List<StudentEntity> findByIdBetween(int startId, int endId);
	
}


