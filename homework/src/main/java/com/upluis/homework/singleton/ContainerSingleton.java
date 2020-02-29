package com.upluis.homework.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author luis
 * @date 2020/2/29
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }

//    public static Object getInstance(String className){
//        Object instance = null;
//        if(!ioc.containsKey(className)){
//            try {
//                instance = Class.forName(className).newInstance();
//                ioc.put(className, instance);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//            return instance;
//        }else{
//            return ioc.get(className);
//        }
//    }
}
