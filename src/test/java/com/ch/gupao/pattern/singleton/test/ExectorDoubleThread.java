package com.ch.gupao.pattern.singleton.test;

import com.ch.gupao.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.ch.gupao.pattern.singleton.lazy.LazySimpleSingleton;

//不用线程池，就用两个线程来演示全过程
public class ExectorDoubleThread implements Runnable{
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
