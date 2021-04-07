package com.geekq.design.pattern.creational.singleton;

/**
 * @author shengwangzhong
 */
public enum EnumInstance {
    INSTANCE {
        @Override
        protected void printTest() {

            /**
             * 打印
             */
            System.out.println("Geekq Print Test");
        }
    };

    private Object data;

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    protected abstract void printTest();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
