package com.example.lesson07.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor   // 파라미터가 모두 있는 생성자
@NoArgsConstructor    // 파라미터가 없는 생성자(기본)
@Builder     // setter 대신
@Getter
@Entity    // 이 객체는 엔티티다. DB-JPA 통신
@Table(name = "new_student")
public class StudentEntity {
	@Id // pk 식별자
	@GeneratedValue(strategy = GenerationType.IDENTITY) // insert시 방금 들어간 id 가져옴
	private int id;
	
	private String name;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	private String email;
	
	@Column(name = "dreamJob")
	private String dreamJob;
	
	@CreationTimestamp // 값이 null이어도 insert 되는 시간으로 들어감
	@Column(name = "createdAt")
	private LocalDateTime createdAt;
	
	@UpdateTimestamp // insert/update 그 시간으로
	@Column(name = "updatedAt")
	private LocalDateTime updatedAt;
}
