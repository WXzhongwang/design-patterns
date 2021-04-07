package com.geekq.design.pattern.creational.abstractfactory;

/**
 * Created by geekq
 * 
 * @author shengwangzhong
 */
public class JavaArticle extends AbstractArticle {

    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
