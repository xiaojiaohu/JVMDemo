package com.atguigu.java1;

public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        System.out.println(arr);//[Ljava. Lang. Object;@1540e19d

        String[] arr1 = new String[10];
        System.out.println(arr1);//[Ljava. Lang. String;@677327b6

        long[][] arr2 = new long[10][];
        System.out.println(arr2);//[[J@14ae5a5
    }
}