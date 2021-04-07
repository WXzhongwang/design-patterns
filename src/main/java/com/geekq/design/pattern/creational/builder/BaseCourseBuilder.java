package com.geekq.design.pattern.creational.builder;

/**
 * 定义抽象类
 *
 * @author shengwangzhong
 */
public abstract class BaseCourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}
