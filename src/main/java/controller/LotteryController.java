package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class LotteryController {

    @GetMapping("/draw")
    public String drawLottery() {
        // 模拟抽奖逻辑，这里简单返回一个固定结果
        Random random = new Random();
             return "恭喜你抽到三等奖";
    }
}