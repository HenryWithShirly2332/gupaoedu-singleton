package com.ch.gupao.pattern.singleton.hungry;

//缺点: 浪费内存空间
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){

        return hungrySingleton;
    }
}
