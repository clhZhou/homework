package com.upluis.homework.singleton;


/**
 * @author luis
 * @date 2020/2/29
 */
public class ExectorThread implements Runnable{

    public void run() {

//        LazySimpleSingletion instance = LazySimpleSingletion.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
//        System.out.println(ThreadLocalSingleton.getInstance());
        Object instance = ContainerSingleton.getInstance("com.upluis.homework.singleton.pojo");
        System.out.println(Thread.currentThread().getName() + ":" + instance);

    }
}
