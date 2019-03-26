package com.ch.gupao.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    //JDK1.6之后对synchronized优化了不少
    //不可避免的还是存在一定的性能问题，造成整个类都有可能被锁
    public synchronized static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}
