package com.geekq.design.pattern.behavioral.templatemethod;

/**
 * 设计模式课程
 * 
 * @author shengwangzhong
 */
public class DesignPatternCourse extends AbstractCourse {

    @Override
    void packageCourse() {

        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {

        return true;
    }

}
