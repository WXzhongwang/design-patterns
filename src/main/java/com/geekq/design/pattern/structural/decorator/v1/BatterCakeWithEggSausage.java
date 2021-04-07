package com.geekq.design.pattern.structural.decorator.v1;

/**
 * 鸡蛋香肠煎饼
 * 
 * @author shengwangzhong
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
