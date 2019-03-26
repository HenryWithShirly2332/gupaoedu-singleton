package com.ch.gupao.pattern.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    //将已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    //JDK考虑到单例会被破坏的情况下，用readResolve()去重新构造
    //重写readResolve()方法，只不过是覆盖了反序列化出来的对象
    //还是创建了两次，发生在JVM层面，相对来说比较安全
    //之前反序列化出来的对象会被GC回收
    private Object readResolve(){

        return INSTANCE;
    }
}
