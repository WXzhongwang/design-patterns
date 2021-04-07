package com.geekq.design.pattern.creational.abstractfactory;

/**
 * Created by geekq
 */
public class JavaVideo extends AbstractVideo {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
