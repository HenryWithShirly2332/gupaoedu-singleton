package com.ch.gupao.pattern.singleton.lazy;

//全程没有用到synchronize,性能上更高
//内部类比外部类要优先加载
//性能最优的一种写法
public class LazyInnerClassSingleton {
    //虽然构造方法私有了，但是，逃不过反射的法眼
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    //懒汉式单例
    //LazyHolder里边的逻辑需要等到外部方法调用时才执行
    //巧妙的利用了内部类的特性
    //JVM底层的执行逻辑，完美的避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
