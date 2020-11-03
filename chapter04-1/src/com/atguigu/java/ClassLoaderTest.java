package com.atguigu.java;

/**
 * jdk9的classloader的变化
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());
        /**
         * jdk.internal.loader.ClassLoaders$AppClassLoader@4f8e5cde
         * jdk.internal.loader.ClassLoaders$PlatformClassLoader@16f65612
         * null
         */

        //获取系统类加载器
        System.out.println(ClassLoader.getSystemClassLoader());
        //获取平台类加载器
        System.out.println(ClassLoader.getPlatformClassLoader());
        /**
         * jdk.internal.loader.ClassLoaders$AppClassLoader@4f8e5cde
         * jdk.internal.loader.ClassLoaders$PlatformClassLoader@16f65612
         */

        //获取类加载器名称
        System.out.println(ClassLoaderTest.class.getClassLoader().getName());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getName());

        /**
         * app
         * platform
         */

    }
}
