package com.geekq.design.pattern.behavioral.strategy;

/**
 * 策略模式测试类
 * 
 * @author shengwangzhong
 */
public class Test {

    public static void main(String[] args) {

        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
