package com.geekq.design.pattern.structural.facade;

/**
 * Created by geekq 积分资格校验
 * 
 * @author shengwangzhong
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过,库存通过");
        return true;
    }
}
