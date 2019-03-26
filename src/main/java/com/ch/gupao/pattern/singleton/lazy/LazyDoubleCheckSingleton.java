package com.ch.gupao.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {
    //volatile关键字解决重指令排序的问题
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    //适中的方案
    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton ==null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //CPU执行时会转换成JVM指令执行
                    //指令重排序的问题 volatile
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关联------赋值
                    //4.用户初次访问
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
