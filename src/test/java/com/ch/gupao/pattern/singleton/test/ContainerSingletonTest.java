package com.ch.gupao.pattern.singleton.test;

import com.ch.gupao.pattern.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.ch.gupao.pattern.singleton.test.Pojo");
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            },10,6);
            //对象方便管理，其实也是属于懒加载
            //存在线程安全问题
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
