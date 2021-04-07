package com.geekq.design.pattern.structural.composite;

/**
 * 课程
 * 
 * @author shengwangzhong
 */
public class Course extends AbstractCatalogComponent {

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(AbstractCatalogComponent catalogComponent) {

        return this.name;
    }

    @Override
    public double getPrice(AbstractCatalogComponent catalogComponent) {

        return this.price;
    }

    @Override
    public void print() {

        System.out.println("Course Name:" + name + " Price:" + price);
    }

}
