package com.geekq.design.pattern.structural.adapter.objectadapter;

/**
 * concreteTarget目标方法
 * 
 * @author shengwangzhong
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {

        System.out.println("concreteTarget目标方法");
    }

}
