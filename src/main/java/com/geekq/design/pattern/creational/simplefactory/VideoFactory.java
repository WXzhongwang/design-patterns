package com.geekq.design.pattern.creational.simplefactory;

/**
 * 简单工厂
 * 
 * @author shengwangzhong
 */
public class VideoFactory {

    public BaseVideo getVideo(Class c) {
        BaseVideo video = null;
        try {
            video = (BaseVideo)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    public BaseVideo getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

}
