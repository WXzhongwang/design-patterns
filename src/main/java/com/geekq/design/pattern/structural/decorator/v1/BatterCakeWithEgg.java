package com.geekq.design.pattern.structural.decorator.v1;

/**
 * 鸡蛋煎饼
 *
 * @author shengwangzhong
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
