package com.geekq.design.pattern.structural.adapter.classadapter;

/**
 * 适配器
 * 
 * @author shengwangzhong
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
