package com.geekq.design.pattern.structural.adapter.classadapter;

/**
 * 具体目标类方法
 * 
 * @author shengwangzhong
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {

        System.out.println("concreteTarget目标方法");
    }
}
