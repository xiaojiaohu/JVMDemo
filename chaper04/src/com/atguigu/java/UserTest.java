package com.atguigu.java;

public class UserTest {
    public static void main(String[] args) {
        //User类被隐式加载
        User user = new User();

        try {
            Class clazz = Class.forName("com.atguigu.java.User");//显示加载
            ClassLoader.getSystemClassLoader().loadClass("com.atguigu.java.User");//显示加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
