package com.atguigu.java;

import java.util.Date;

/*
 *指令1:加载与存储指令
 * */
public class LoadAndStoreTest {

    //1.局部变量压栈指令 load
    public void load(int num, Object obj, long count, boolean flag, short[] arr) {
        System.out.println(num);
        System.out.println(obj);
        System.out.println(count);
        System.out.println(flag);
        System.out.println(arr);
        /**
         *  0 getstatic #2 <java/lang/System.out>
         *  3 iload_1
         *  4 invokevirtual #3 <java/io/PrintStream.println>
         *  7 getstatic #2 <java/lang/System.out>
         * 10 aload_2
         * 11 invokevirtual #4 <java/io/PrintStream.println>
         * 14 getstatic #2 <java/lang/System.out>
         * 17 lload_3
         * 18 invokevirtual #5 <java/io/PrintStream.println>
         * 21 getstatic #2 <java/lang/System.out>
         * 24 iload 5
         * 26 invokevirtual #6 <java/io/PrintStream.println>
         * 29 getstatic #2 <java/lang/System.out>
         * 32 aload 6
         * 34 invokevirtual #4 <java/io/PrintStream.println>
         * 37 return
         */
    }

    //2.常量入栈指令 const->push->ldc 越来越大
    public void pushConstLdc() {
        int a = 5;
        int b = 6;
        int c = 127;
        int d = 128;
        int e = 1234567;
        /**
         *  0 iconst_5
         *  1 istore_1
         *  2 bipush 6
         *  4 istore_2
         *  5 bipush 127
         *  7 istore_3
         *  8 sipush 128
         * 11 istore 4
         * 13 ldc #7 <1234567>
         * 15 istore 5
         * 17 return
         */
    }
    public void constLdc(){
        long a1 =1;
        long a2 =2;
        float b1 =2;
        float b2 =3;
        double c1 =1;
        double c2 =2;
        Date d = null;
//        Date d1 = new Date();
        /**
         *  0 lconst_1
         *  1 lstore_1
         *  2 ldc2_w #8 <2>
         *  5 lstore_3
         *  6 fconst_2
         *  7 fstore 5
         *  9 ldc #10 <3.0>
         * 11 fstore 6
         * 13 dconst_1
         * 14 dstore 7
         * 16 ldc2_w #11 <2.0>
         * 19 dstore 9
         * 21 aconst_null
         * 22 astore 11
         * 24 return
         */

    }

    //3 出栈装入局部变量表指令 store
    public void store(int k,double d){
        int m = k+2;
        long l = 12;
        String str = "atguigu";
        float f = 10.0F;
        d = 10;
        /**
         *  0 iload_1
         *  1 iconst_2
         *  2 iadd
         *  3 istore 4
         *  5 ldc2_w #13 <12>
         *  8 lstore 5
         * 10 ldc #15 <atguigu>
         * 12 astore 7
         * 14 ldc #16 <10.0>
         * 16 fstore 8
         * 18 ldc2_w #17 <10.0>
         * 21 dstore_2
         * 22 return
         */
    }
    public void foo(long a,float f){
        {
            int i = 0;
        }
        {
            String s= "Hello,World";
        }
    }


}