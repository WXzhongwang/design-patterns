package com.geekq.design.principle.dependenceinversion;

/**
 * Created by geekq
 */
public class Geekq {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

}
