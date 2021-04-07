package com.geekq.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录
 * 
 * @author shengwangzhong
 */
public class CourseCatalog extends AbstractCatalogComponent {

    private List<AbstractCatalogComponent> items = new ArrayList<AbstractCatalogComponent>();

    private String name;

    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(AbstractCatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public String getName(AbstractCatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void remove(AbstractCatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (AbstractCatalogComponent catalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catalogComponent.print();
        }
    }

}
