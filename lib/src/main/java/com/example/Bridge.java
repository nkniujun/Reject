package com.example;

/**
 * Created by momo on 2017/11/29.
 */

public class Bridge {
    public static <T> T obtain(Class<T> cls) {
//        String className = cls.getName();
        String className = cls.getName() + "Impl";
        show(className);
        try {
            Class classType = Class.forName(className);
            Object obj = classType.newInstance();
            return (T) obj;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void show(String msg) {
        System.out.println(msg);
    }
}
