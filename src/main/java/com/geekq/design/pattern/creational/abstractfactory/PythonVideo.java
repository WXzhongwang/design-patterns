package com.geekq.design.pattern.creational.abstractfactory;

/**
 * @author shengwangzhong
 */
public class PythonVideo extends AbstractVideo {

    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
