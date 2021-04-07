package com.geekq.design.pattern.behavioral.iterator;

/**
 * 课程迭代器
 * 
 * @author shengwangzhong
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}
