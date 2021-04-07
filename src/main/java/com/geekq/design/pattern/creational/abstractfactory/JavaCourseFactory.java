package com.geekq.design.pattern.creational.abstractfactory;

/**
 * Created by geekq
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public AbstractVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new JavaArticle();
    }
}
