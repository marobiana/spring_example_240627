package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service   // Spring bean 등록
public class UsedGoodsBO {
	
	@Autowired  // DI(Dependency Injection): 의존성 주입
	private UsedGoodsMapper usedGoodsMapper;
	
	// input:X 컨트롤러한테 받는다.
	// output: 컨트롤러한테 준다. List<UsedGoods>
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		return usedGoodsList; // 컨트롤러한테 리턴
	}
}




