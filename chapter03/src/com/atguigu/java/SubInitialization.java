package com.atguigu.java;

public class SubInitialization extends InitializationTest {
    static {
         number = 4;//number属性必须提前已经加载:一定会先加载父类。
        System.out.println("son static()");
    }

    public static void main(String[] args) {
        System.out.println(number);
        /**
         * father static()
         * son static()
         * 4
         */
    }
}