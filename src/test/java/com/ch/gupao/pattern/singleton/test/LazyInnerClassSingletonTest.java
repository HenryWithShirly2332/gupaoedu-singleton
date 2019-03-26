package com.ch.gupao.pattern.singleton.test;

import com.ch.gupao.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        try {
            //调用者不走寻常路，破坏了单例
            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);//授权 强制访问

            Object o1 = c.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
