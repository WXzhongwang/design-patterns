package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 * 
 * @author shengwangzhong
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
