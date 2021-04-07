package com.geekq.design.pattern.behavioral.strategy;

/**
 * 促销活动
 * 
 * @author shengwangzhong
 */
public class PromotionActivity {

    /**
     * 策略实体
     */
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }

}
