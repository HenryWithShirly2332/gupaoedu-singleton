package com.ch.gupao.pattern.singleton.threadlocal;

public class ThreadLocalSingleton {
    //同一个线程里面是同一个对象，在另外一个线程里面又会新建对象
    //在线程内部能够保证线程安全，在跨线程里面就是线程不安全的
    //伪线程安全
    //使用ThreadLocal来实现多数据源动态切换
    private ThreadLocalSingleton(){}
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){

                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
