package com.geekq.design.pattern.behavioral.templatemethod;

/**
 * 课程实体抽象
 * 
 * @author shengwangzhong
 */
public abstract class AbstractCourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    /**
     * 钩子方法 可以自行决定是否需要重写此方法
     * 
     * @return
     */
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();

}
