package com.atguigu.java;
/**
*哪些场景下, java编译器就不会生成clinit>()方法
 * */
public class InitializationTest1 {
    //场景1:对应非静态的字段，不管是否迸行了显式赋值，都不会生成<clinit>()方法
    public int num = 1;
    //场景2:静态的字段，没有显式赋值，不会生成clinit>()方法
    public static int num1;
    //场景3:比如チ声明カstatic final 的基本数据类型的字段，不管是否迸行了显式赋值，都不会生成<clinit>()方法(在准备环节已经赋值了）
    public static final int num2 = 1;
}