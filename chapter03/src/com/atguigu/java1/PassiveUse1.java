package com.atguigu.java1;

/**
 * 关于类的被动使用，即不会进行类的初始化操作，即不会调用clinit方法
 *
 * 1. 当访问一个静态字段时，只有真正声明这个字段的类才会被初始化
 *      >当通过子类引用父类的静态变量，不会导致子类初始化
 * 2. 通过数组定义类引用，不会触发此类的初始化
 *
 *
 * 说明：没有初始化的类不意味着没有加载
 *
 */
public class PassiveUse1 {

    public static void test1(){
        System.out.println(Child.num);
        /**
         * Parent类的初始化过程
         * 1
         */
    }

    public static void test2(){
        Parent[] parents = new Parent[10];
        System.out.println(parents.getClass());
        System.out.println(parents.getClass().getSuperclass());

        System.out.println("=====================");

        parents[0] =new Parent();//此时会进行Parent类的初始化
        parents[1] =new Parent();//类的初始化只会进行一次

        /**
         * class [Lcom.atguigu.java1.Parent;
         * class java.lang.Object
         * =====================
         * Parent类的初始化过程
         */
    }

    public static void main(String[] args) {
//        test1();
        test2();
    }



}
class Parent {
    static {
        System.out.println("Parent类的初始化过程");
    }
    public static int num = 1;
}

class Child extends Parent  {


    static {
        System.out.println("Child类的初始化过程");
    }
}