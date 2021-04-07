package com.geekq.design.pattern.structural.facade;

/**
 * 外观模式测试类
 * 
 * @author shengwangzhong
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        // 礼物兑换服务
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
