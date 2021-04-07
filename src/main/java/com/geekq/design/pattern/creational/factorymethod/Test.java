package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 * 
 * @author shengwangzhong
 */
public class Test {
    public static void main(String[] args) {
        BaseVideoFactory videoFactory = new PythonVideoFactory();
        BaseVideoFactory videoFactory2 = new JavaVideoFactory();
        BaseVideoFactory videoFactory3 = new FEVideoFactory();
        BaseVideo video = videoFactory.getVideo();
        video.produce();
    }
}
