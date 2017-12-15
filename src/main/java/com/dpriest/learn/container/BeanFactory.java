package com.dpriest.learn.container;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by zhangwenhao on 15/12/2017.
 */
public class BeanFactory {
    private Map<String, Object> objects = Maps.newHashMap();

    public void set(String key, Object object) {
        objects.put(key, object);
    }

    public Object get(String key) {
        return objects.get(key);
    }
}
