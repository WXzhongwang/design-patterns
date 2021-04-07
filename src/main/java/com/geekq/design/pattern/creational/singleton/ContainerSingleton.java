package com.geekq.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * 单例容器
 *
 * @author shengwangzhong
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    private ContainerSingleton() {

    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
