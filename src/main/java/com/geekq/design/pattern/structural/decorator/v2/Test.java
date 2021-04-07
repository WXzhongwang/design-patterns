package com.geekq.design.pattern.structural.decorator.v2;

/**
 * Created by geekq
 */
public class Test {
    public static void main(String[] args) {

        AbstractBatterCake abstractBatterCake;
        abstractBatterCake = new BatterCake();
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new SausageDecorator(abstractBatterCake);

        System.out.println(abstractBatterCake.getDesc() + " 销售价格:" + abstractBatterCake.cost());

    }
}
