package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 * 
 * @author shengwangzhong
 */
public class FEVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
