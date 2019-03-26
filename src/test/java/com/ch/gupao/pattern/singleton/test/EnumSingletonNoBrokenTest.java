package com.ch.gupao.pattern.singleton.test;

import com.ch.gupao.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonNoBrokenTest {
    public static void main(String[] args) {
        //JDK层面就为枚举不被序列化和反射破坏来保驾护航
        try {
            Class clazz =EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton obj = (EnumSingleton)c.newInstance("Lakers",23);
            System.out.println(obj);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
