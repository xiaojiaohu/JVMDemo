package com.atguigu.java1;

import java.util.Random;



/**
 * 如果针对代码，设置参数 -XX:+TraceClassLoading，可以追踪类的!!加载信息!!并打印出来
 * <p>
 * 4.当使用 java.lang.reflect 包中的方法反射类的方法时。比如：Class.forname("com.atguigu.java.Test")
 * 5.当初始化子类时，如果发现其分类还没有进行过初始化，则需要先触发其父类的初始化
 * 6.如果一个接口定义了 default 方法，那么直接实现或者间接实现该接口的类的初始化，该接口要在其之前被初始化
 * 7.当虚拟机启动时，用户需要指定一个要执行的主类(包含 main() 方法的那个类)，虚拟机会先初始化这个主类
 * 8.当初次调用 MethodHandle 实例时，初始化该 MethodHandle 指向的方法所在的类。(涉及解析 REF_getStatic、REF_putStatic、REF_invokeStatic 方法句柄对应的类)
 * <p>
 * 针对5，补充说明：
 * 当 Java 虚拟机初始化一个类时，要求它的所有父类都已经被初始化，但是这条规则并不适用于接口
 * • 在初始化一个类时，并不会先初始化它所实现的接口
 * • 在初始化一个接口时，并不会先初始化它的父接口
 * 因此，一个父接口并不会因为它的子接口或者实现类的初始化而初始化，只有当程序首次使用特定接口的静态字段时，才会导致该接口的初始化
 *
 * 针对7，说明：
 * JVM 启动的时候通过引导类加载器加载一个初始类。这个类在调用 public static void main(String[]) 方法之前被链接和初始化。这个方法的执行将依次导致所需的类的加载、链接和初始化
 */
public class ActiveUse3 {
    static {
        System.out.println("ActiveUse3类的初始化过程");
    }


    public static void test1() {

        try {
            Class<?> aClass = Class.forName("com.atguigu.java1.Order");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        System.out.println("hello");
        /**
         * ActiveUse3类的初始化过程
         * hello
         */
    }

    public static void test2() {
        System.out.println(Son.num);//CompareB接口确实加载了，但是未初始化
        /**
         * Father类的初始化过程
         * CompareD类的初始化过程
         * Son类的初始化过程
         * 1
         */

    }

    public static void test3() {
        System.out.println(CompareC.NUM2);//在初始化一个接口时，并不会先初始化它的父接口
        /**
         * CompareC类的初始化过程
         * 6
         */
    }

    public static void test4() {
        System.out.println(Son.num);
    }

    public static void test5() {
    }


}

class Father {
    static {
        System.out.println("Father类的初始化过程");
    }
}

class Son extends Father implements CompareB, CompareD {
    public static int num = 1;

    static {
        System.out.println("Son类的初始化过程");
    }
}

interface CompareB {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareB类的初始化过程");
        }
    };
}

interface CompareC extends CompareB {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareC类的初始化过程");
        }
    };
    public static int NUM2 = new Random().nextInt(10);
}

interface CompareD {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareD类的初始化过程");
        }
    };

    public default void method1() {
        System.out.println("你好");

    }

}