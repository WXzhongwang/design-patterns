package com.geekq.design.pattern.creational.simplefactory;

/**
 * Created by geekq
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
