package com.geekq.design.pattern.creational.abstractfactory;

/**
 * Created by geekq
 */
public class PythonArticle extends AbstractArticle {

    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
