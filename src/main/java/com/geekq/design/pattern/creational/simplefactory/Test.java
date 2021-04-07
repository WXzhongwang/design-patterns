package com.geekq.design.pattern.creational.simplefactory;

/**
 * @author shengwangzhong
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        BaseVideo video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
