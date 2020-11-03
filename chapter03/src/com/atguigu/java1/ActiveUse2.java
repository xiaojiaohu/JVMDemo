package com.atguigu.java1;

import java.util.Random;

/**
 *
 * 3.当使用类、接口的静态字段时(final 修饰特殊考虑)，比如，使用 getstatic 或者 putstatic 指令。(对应访问变量、赋值变量操作)
 *  */
public class ActiveUse2 {

    public static void test1(){

        System.out.println(User.num); //会进行User类初始化
        /**
         * User类的初始化过程
         * 1
         */

    }
    public static void test2(){

        System.out.println(User.num1); //不会进行User类的初始化
        /**
         * 2
         */

    }
    public static void test3(){

        System.out.println(User.num2); //会进行User类的初始化
        /**
         * User类的初始化过程
         * 2
         */

    }

    public static void test4(){

        System.out.println(CompareA.num1);
        /**
         * 1
         */

    }
    public static void test5(){

        System.out.println(CompareA.num2);
        /**
         * CompareA类的初始化过程
         * User类的初始化过程
         * 4
         */

    }

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }


}


class User{
    static {
        System.out.println("User类的初始化过程");
    }

    public static int num =1;
    public static final int  num1 =2;
    public static final int num2 = new Random().nextInt(10);
}
interface CompareA{
    //验证方式一、因为用static final修饰的变量通过new 一个实例 这种方式创建的话，肯定是在clinit中执行，所以肯定会输出"CompareA类的初始化过程"语句
    public static final Thread t = new Thread(){
        {
            System.out.println("CompareA类的初始化过程");
        }
    };

    public static final int num1 =1;
    public static int num2 = new Random().nextInt(10);

    //验证方式二、clinit方法如果调用肯定会用调用New User,进而执行User的clinit方法
    public static final User user =new User();
}