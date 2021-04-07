package com.geekq.design.pattern.creational.abstractfactory;

/**
 * @author shengwangzhong
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        AbstractVideo video = courseFactory.getVideo();
        AbstractArticle article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
