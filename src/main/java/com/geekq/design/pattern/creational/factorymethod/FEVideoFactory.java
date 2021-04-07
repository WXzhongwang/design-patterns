package com.geekq.design.pattern.creational.factorymethod;

/**
 * @author shengwangzhong
 */
public class FEVideoFactory extends BaseVideoFactory {
    @Override
    public BaseVideo getVideo() {
        return new FEVideo();
    }
}
