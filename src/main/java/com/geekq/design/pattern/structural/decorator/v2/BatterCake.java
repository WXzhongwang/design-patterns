package com.geekq.design.pattern.structural.decorator.v2;

/**
 * 一般煎饼
 * 
 * @author shengwangzhong
 */
public class BatterCake extends AbstractBatterCake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
