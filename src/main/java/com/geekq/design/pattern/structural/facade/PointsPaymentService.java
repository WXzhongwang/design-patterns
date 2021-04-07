package com.geekq.design.pattern.structural.facade;

/**
 * 支付服务
 * 
 * @author shengwangzhong
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }

}
