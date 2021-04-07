package com.geekq.design.pattern.behavioral.templatemethod;

/**
 * 模板方法
 * 
 * @author shengwangzhong
 */
public class Test {
    public static void main(String[] args) {
        // System.out.println("后端设计模式课程start---");
        // ACourse designPatternCourse = new DesignPatternCourse();
        // designPatternCourse.makeCourse();
        // System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        AbstractCourse feCourse = new FrontEndCourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");

    }
}
