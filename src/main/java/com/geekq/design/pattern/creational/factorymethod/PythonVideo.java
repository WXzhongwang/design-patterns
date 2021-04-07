package com.geekq.design.pattern.creational.factorymethod;

/**
 * @author shengwangzhong
 */
public class PythonVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
