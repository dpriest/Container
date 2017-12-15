package com.dpriest.learn.application;

import com.dpriest.learn.container.BeanFactory;

/**
 * Created by zhangwenhao on 15/12/2017.
 */
public class Main {
    private static BeanFactory beanFactory = new BeanFactory();

    private static void prepare() {
        Foo foo = new Foo();
        beanFactory.set("bar", new Bar(foo));
        beanFactory.set("foo", foo);
    }

    public static void main(String[] args) {
        prepare();

        Bar bar = (Bar)beanFactory.get("bar");
        bar.run();
    }
}
