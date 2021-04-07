package com.geekq.design.pattern.structural.composite;

/**
 * AbstractCatalogComponent 抽象
 *
 * @author shengwangzhong
 */
public abstract class AbstractCatalogComponent {

    public void add(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
