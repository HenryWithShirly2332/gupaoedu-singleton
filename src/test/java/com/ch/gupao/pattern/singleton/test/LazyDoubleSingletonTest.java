package com.ch.gupao.pattern.singleton.test;

public class LazyDoubleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExectorDoubleThread());
        Thread t2 = new Thread(new ExectorDoubleThread());

        t1.start();
        t2.start();

        System.out.println("Exctor End");
    }
}
