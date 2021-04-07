package com.geekq.design.pattern.behavioral.templatemethod;

/**
 * FECourse
 * 
 * @author shengwangzhong
 */
public class FrontEndCourse extends AbstractCourse {

    private boolean needWriteArticleFlag = false;

    public FrontEndCourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {

        return this.needWriteArticleFlag;
    }
}
