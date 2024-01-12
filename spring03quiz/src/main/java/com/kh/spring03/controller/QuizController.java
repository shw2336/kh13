package com.kh.spring03.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

///dice : 랜덤으로 주사위 번호 1개를 출력
///lotto : 랜덤으로 로또번호 6개를 출력
///food : 랜덤으로 본인이 원하는 식사메뉴 중 하나를 출력

@RestController
public class QuizController {
    Random r = new Random();
    
    @RequestMapping("/dice")
    public int dice() {
        int diceNum = r.nextInt(6) + 1;
        return diceNum;
    }
    
    @RequestMapping("/lotto")
    public ArrayList<Integer> lotto() {
        ArrayList<Integer> lotto = new ArrayList<>();
        for(int i = 1 ; i <= 6 ; i++) {
            int lottoNum = r.nextInt(45) + 1;
                if(!lotto.contains(lottoNum)){
                    lotto.add(lottoNum);
                    }
                else {
                    i--;
                }
            }
            return lotto;
        }
    
//    @RequestMapping("/food")
//    public 
}