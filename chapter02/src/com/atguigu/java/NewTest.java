package com.atguigu.java;

import java.io.File;

/**
 * 指令4:对象、数组的创建与访问指令
 */
public class NewTest {
    //1.创建指令
    public void newInstance() {
        Object obj = new Object();
        File file = new File("atguigu.avi");
        /**
         *  0 new #2 <java/lang/Object>
         *  3 dup
         *  4 invokespecial #1 <java/lang/Object.<init>>
         *  7 astore_1
         *  8 new #3 <java/io/File>
         * 11 dup
         * 12 ldc #4 <atguigu.avi>
         * 14 invokespecial #5 <java/io/File.<init>>
         * 17 astore_2
         * 18 return
         */
    }

    public void newArray() {
        int[] intArray = new int[10];// newarray 10 (int)
        Object[] objArray = new Object[10]; //anewarray #2 <java/lang/Object>
        int[][] mintArray = new int[10][10];// multianewarray #6 <[[I> dim 2
        String[][] strArray = new String[10][];//anewarray #7 <[Ljava/lang/String;>
        String[][] strArray2 = new String[10][5];// multianewarray #8 <[[Ljava/lang/String;> dim 2
    }

    //2.字段访问指令

    //访问类字段(static字段，或者称为类变量)的指令: getstatic、 putstatic
    //访问类实例字段(非static字段，或者称为实例变量)的指令: getfield、 putfield
    public void sayHe1lo() {
        /**
         * 以getstatic指令为例，它含有一个操作数，为指向常量池的Fieldref索引，它的作用就是获取Fieldref指定的
         * 对象或者值，并将其压入操作数栈。
         */
        System.out.println("hello");
    }

    public void setOrderId() {
        Order order = new Order();
        order.id = 1001;
        System.out.println(order.id);

        Order.name = "ORDER";
        System.out.println(Order.name);

    }
    //3.数组操作指令 xaload xastore (x= c,b,s,i,l,f,d,a)
    public void setArray(){
        int[] intArray = new int[10];
        intArray[3] = 20;
        System.out.println(intArray[1]);
        boolean[] arr = new boolean[10];
        arr[1] = true;
    }
    public void srrLength(){
        double[] arr = new double[10];
        System.out.println(arr.length);
    }






    //4.类型检查指令
    public String checkCast(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        } else {
            return null;
        }

        /**
         *  0 aload_1
         *  1 instanceof #18 <java/lang/String>
         *  4 ifeq 12 (+8)
         *  7 aload_1
         *  8 checkcast #18 <java/lang/String>
         * 11 areturn
         * 12 aconst_null
         * 13 areturn
         */
    }
}
    class Order {
        static String name;
        int id;
    }