package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {

	// input: X
	// output: Review 단건 or 없으면 null
	public Review selectReview();
}




