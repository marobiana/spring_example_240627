package com.example.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson02.domain.UsedGoods;

@Mapper
public interface UsedGoodsMapper {
	
	// input: BO한테 받아옴.  X
	// output: BO한테 돌려줌. List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();
}




