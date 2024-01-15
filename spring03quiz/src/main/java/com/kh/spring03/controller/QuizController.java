package com.kh.spring03.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링의 1원칙 : 무조건 등록부터 해라(IoC, 제어반전)
@RestController
public class QuizController {
	Random r = new Random();

	@RequestMapping("/dice")
	public int dice() {

		int dice = r.nextInt(6) + 1;

		return dice;	
	}

	@RequestMapping("/lotto")
	public ArrayList<Integer> lotto() {
		ArrayList<Integer> lotto = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			int lottoNum = r.nextInt(45) + 1;
			if (!lotto.contains(lottoNum)) {
				lotto.add(lottoNum);
			} else {
				i--;
			}
		}
		return lotto;
	}

	@RequestMapping("/food")
	public String food() {
		Random r = new Random();
		String[] food = new String[] { "라면", "햄버거", "피자", "치킨", "보쌈" };
		int position = r.nextInt(food.length);
		String result = food[position];
		return result;
	}

}