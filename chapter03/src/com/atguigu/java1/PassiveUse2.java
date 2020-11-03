package com.atguigu.java1;

import java.util.Random;

/**
 *  3. 引用常量不会触发此类或接口的初始化。因为常量在链接阶段就已经被显式赋值了 (!!见详细说明见ActiveUse2!!）
 *  4. 调用 ClassLoader 类的 loadClass() 方法加载一个类，并不是对类的主动使用，不会导致类的初始化 (不同于 Class.forName,见ActiveUse3)
 */
public class PassiveUse2 {
    public static void test1(){
        System.out.println(Person.num);

        /**
         * 1
         */
    }
    public static void test2(){
        System.out.println(Person.num1);
        /**
         * Person类的初始化过程
         * 0
         */
    }

    public static void test3(){
        try {
            Class<?> aClass = ClassLoader.getSystemClassLoader().loadClass("com.atguigu.java1.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /**
         *
         */
    }

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }



}
class Person {
    static {
        System.out.println("Person类的初始化过程");
    }
    public static final int num = 1; //在链接过程的准备环节就被赋值为1了
    public static final int num1 = new Random().nextInt(10);
}
