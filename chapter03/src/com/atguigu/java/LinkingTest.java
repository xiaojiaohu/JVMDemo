package com.atguigu.java;

/* *

*过程二:链接阶段(验证-准备-解析）
*
*   基本数据类型: 非final 修饰的变量，在linking的准备环节进行默认初始化赋值。
*               final修饰以后，在linking的准备环节直接进行显示赋值。
*   拓展:如果使用字面量的方式定义一个字符串的常量的话，也是在准备环节直接进行显示赋值。
*
*   解析阶段(Resolution)， 简言之，将类、接口、字段和方法的符号引用转为直接引用。
*/
public class LinkingTest {
    private static long id;

    private static final int пиm = 1;

    public static final String constStr = "CONST";
    public static final String constStr1 = new String("CONST");//linking的prepare环节只赋一个null默认值，初始化阶段 clinit赋值CONST
    public Object getObj(){
        return null;
    }
    public void print1(){
        System.out.println("hello");
    }



}
