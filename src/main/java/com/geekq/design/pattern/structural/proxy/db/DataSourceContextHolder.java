package com.geekq.design.pattern.structural.proxy.db;

/**
 * Created by geekq
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static String getDBType() {
        return CONTEXT_HOLDER.get();
    }

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }

}
