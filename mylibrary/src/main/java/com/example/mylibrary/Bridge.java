package com.example.mylibrary;

/**
 * Created by momo on 2017/11/29.
 */

public class Bridge {
    public static <T> T obtain(Class<T> cls) {
//        String className = cls.getName();//com.example.mylibrary.NJAction
//        String className = cls.getSimpleName();//NJAction
//        String className = cls.getPackage().toString();//package com.example.mylibrary
//        String className = cls.getPackage().getName();//com.example.mylibrary
//        String className = cls.getPackage().getName() + "Impl";
        /*注意包名的获取*/
//        String className = "com.example.momo.reject.NJActionImpl";
         String className ="com.example.momo.reject."+cls.getSimpleName()+"Impl";
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
