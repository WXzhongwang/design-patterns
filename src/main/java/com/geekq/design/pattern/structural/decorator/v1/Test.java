package com.geekq.design.pattern.structural.decorator.v1;

/**
 * 测试类
 *
 * @author shengwangzhong
 */
public class Test {
    public static void main(String[] args) {

        BatterCake battercake = new BatterCake();
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 销售价格:" + batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 销售价格:" + batterCakeWithEggSausage.cost());

    }
}
