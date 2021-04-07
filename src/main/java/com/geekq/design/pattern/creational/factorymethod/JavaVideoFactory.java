package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 * 
 * @author shengwangzhong
 */
public class JavaVideoFactory extends BaseVideoFactory {

    @Override
    public BaseVideo getVideo() {
        return new JavaVideo();
    }
}
