package com.geekq.design.pattern.creational.factorymethod;

/**
 * @author shengwangzhong
 */
public class PythonVideoFactory extends BaseVideoFactory {
    @Override
    public BaseVideo getVideo() {
        return new PythonVideo();
    }
}
