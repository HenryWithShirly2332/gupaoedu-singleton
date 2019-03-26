package com.ch.gupao.pattern.singleton.test;

import com.ch.gupao.pattern.singleton.lazy.LazySimpleSingleton;
import com.ch.gupao.pattern.singleton.threadlocal.ThreadLocalSingleton;

//不用线程池，就用两个线程来演示全过程
public class ExectorThread implements Runnable{
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
