package com.geekq.design.pattern.structural.adapter;

/**
 * 适配器设计模式测试
 * 
 * @author shengwangzhong
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
