package com.atguigu.java;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层  扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@610455d6

        //获取其上层 获取不到引导类加载器
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);//null

        //对于用户自定义类来说：使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest1.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //String 类使用引导类加载器进行加载的  -->java核心类库都是使用引导类加载器加载的
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);//null




        //关于数组类型的加载：与数组当中元素类型的类加载器是一样的
        String[] strArr = new String[6];
        System.out.println(strArr.getClass().getClassLoader());//运行结果：null

        ClassLoaderTest1[] test = new ClassLoaderTest1[1];
        System.out.println(test.getClass().getClassLoader());//运行结果：sun.misc.Launcher$AppClassLoader@18b4aac2

        int[] inst = new int[2];
        System.out.println(inst.getClass().getClassLoader());//运行结果：null 如果数组当中的元素类型是基本数据类型，数组类是没有类加载器的



    }
}
