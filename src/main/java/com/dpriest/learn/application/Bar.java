package com.dpriest.learn.application;

/**
 * Created by zhangwenhao on 15/12/2017.
 */
public class Bar {
    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }

    public void run() {
        foo.run();
    }
}
