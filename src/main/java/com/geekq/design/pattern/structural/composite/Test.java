package com.geekq.design.pattern.structural.composite;

/**
 * Created by geekq
 * 
 * @author shengwangzhong
 */
public class Test {

    public static void main(String[] args) {

        AbstractCatalogComponent linuxCourse = new Course("Linux课程", 11);
        AbstractCatalogComponent windowsCourse = new Course("Windows课程", 11);

        AbstractCatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);

        AbstractCatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        AbstractCatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        AbstractCatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        AbstractCatalogComponent imoocMainCourseCatalog = new CourseCatalog("课程主目录", 1);

        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();

    }
}
