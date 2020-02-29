package com.upluis.homework.singleton;


/**
 * @author luis
 * @date 2020/2/29
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
//        Object instance1 = ContainerSingleton.getInstance("com.upluis.homework.singleton.pojo");
//        Object instance2 = ContainerSingleton.getInstance("com.upluis.homework.singleton.pojo");
//        System.out.println(instance1 == instance2);

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
