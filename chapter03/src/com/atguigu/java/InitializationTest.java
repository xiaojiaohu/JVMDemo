package com.atguigu.java;
/**
  *过程三:初始化阶段
 * 初始化畍段的重要工作是抉行美的初始化方法:<clinit>方法。
     * 该方法仅能由Java编译器生成并由JVM调用，程序开发者无法自定义一个同名的方法，更无法直接在Java程序中调用该方法，虽然该方法也是由字节码指令所组成。
     * 它是由类静态成员的赋值语句以及static语句块合并产生的。
 */
public class InitializationTest {
    public static int id = 1;
    public static int number;

    static {
        number = 2;
        System.out.println("father static()");
    }
}