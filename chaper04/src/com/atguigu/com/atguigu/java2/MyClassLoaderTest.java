package com.atguigu.com.atguigu.java2;


public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader("/Users/huxiaojie/Documents/workspace/jvm/JVMDemo/chaper04/src/com/atguigu/java/");
        try {
            Class<?> demo1 = loader.findClass("User");

            System.out.println("加载此类的类加载器为：" + demo1.getClassLoader().getClass().getName());//com.atguigu.com.atguigu.java2.MyClassLoader

            System.out.println("加载此类的类加载器的父类加载器为：" + demo1.getClassLoader().getParent().getClass().getName());//sun.misc.Launcher$AppClassLoader
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
