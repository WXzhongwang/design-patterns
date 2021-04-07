package com.geekq.design.pattern.creational.abstractfactory;

/**
 * @author shengwangzhong
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public AbstractVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new PythonArticle();
    }
}
