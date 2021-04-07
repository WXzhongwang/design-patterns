package com.geekq.design.pattern.structural.decorator.v2;

/**
 * 装饰器抽象
 * 
 * @author shengwangzhong
 */
public abstract class AbstractDecorator extends AbstractBatterCake {

    /**
     * 煎饼类实例
     */
    private AbstractBatterCake abstractBatterCake;

    public AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    /**
     * 其他方法
     */
    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.abstractBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractBatterCake.cost();
    }
}
