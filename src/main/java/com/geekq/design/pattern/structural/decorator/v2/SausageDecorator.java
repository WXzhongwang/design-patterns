package com.geekq.design.pattern.structural.decorator.v2;

/**
 * 香肠煎饼
 * 
 * @author shengwangzhong
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
