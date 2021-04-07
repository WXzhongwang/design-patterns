package com.geekq.design.pattern.creational.abstractfactory;

/**
 * 工厂接口
 *
 * @author shengwangzhong
 */
public interface CourseFactory {

    AbstractVideo getVideo();

    AbstractArticle getArticle();

}
