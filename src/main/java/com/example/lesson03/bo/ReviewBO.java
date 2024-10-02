package com.example.lesson03.bo;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewMapper reviewMapper;

	// input: int
	// output: Review
	public Review getReviewById(int id) {
		return reviewMapper.selectReviewById(id);
	}
	
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	public int addReviewAsField(int storeId, String menu,
			String userName, Double point, String review) {
		
		return reviewMapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
}






