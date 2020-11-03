package com.atguigu.java;

/**
 * 指令2：算数指令
 */

public class ArithmeticTest {
    public static void method1() {
        int i = 10;
//        int j = i / 0;
//        System.out.println(j);//java.lang.ArithmeticException: / by zero
        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(i / 0.0);//Infinity 无穷大
        System.out.println(d2); //NaN ： not a number 不是一个确定值
    }

    public static void main(String[] args) {
        method1();
    }

    public void method2() {
        float i = 10;
        float j = -i;
        i = -j;
        /**
         * 0 ldc #5 <10.0>
         * 2 fstore_1
         * 3 fload_1
         * 4 fneg
         * 5 fstore_2
         * 6 fload_2
         * 7 fneg
         * 8 fstore_1
         * 9 return
         */
    }

    public void method3(int j) {
        int i = 100;
        i = i + 10;
        i += 10;
        /**
         *  0 bipush 100
         *  2 istore_2
         *  3 iload_2
         *  4 bipush 10
         *  6 iadd
         *  7 istore_2
         *  8 iinc 2 by 10
         * 11 return
         */
    }

    public int method4() {
        int a = 80;
        int b = 7;
        int c = 10;
        return (a + b) * c;
        /**
         *  0 bipush 80
         *  2 istore_1
         *  3 bipush 7
         *  5 istore_2
         *  6 bipush 10
         *  8 istore_3
         *  9 iload_1
         * 10 iload_2
         * 11 iadd
         * 12 iload_3
         * 13 imul
         * 14 ireturn
         */
    }

    public int method5(int i, int j) {
        return (i + j - 1) & ~(j - 1);
        /**
         * 0 iload_1
         *  1 iload_2
         *  2 iadd
         *  3 iconst_1
         *  4 isub
         *  5 iload_2
         *  6 iconst_1
         *  7 isub
         *  8 iconst_m1
         *  9 ixor
         * 10 iand
         * 11 ireturn
         */
    }

    //夫干(前)++和(后)++
    public void method6() {
        int i = 10;
        i++;
        ++i;
        /**
         * 0 bipush 10
         * 2 istore_1
         * 3 iinc 1 by 1
         * 6 iinc 1 by 1
         * 9 return
         */
    }

    public void method7() {
        int i = 10;
//         *  3 iload_1
//         *  4 iinc 1 by 1
//         *  7 istore_2
        int a = i++; //后加 是先load到操作数栈，然后直接在局部变量表iinc,之后进行istore赋值
        int j = 20;
//         * 11 iinc 3 by 1
//         * 14 iload_3
//         * 15 istore 4
        int b = ++j;//先加 是先iinc,在load ,在istore
        /**
         *  0 bipush 10
         *  2 istore_1
         *  3 iload_1
         *  4 iinc 1 by 1
         *  7 istore_2
         *  8 bipush 20
         * 10 istore_3
         * 11 iinc 3 by 1
         * 14 iload_3
         * 15 istore 4
         * 17 return
         */
    }

    /**
     * 3 iload_1
     * 4 iinc 1 by 1
     * 7 istore_1
     */
    //思考
    public void method8() {
        int i = 10;
        i = i++;
        System.out.println(i);
        /**
         * 0 bipush 10
         *  2 istore_1
         *  3 iload_1
         *  4 iinc 1 by 1
         *  7 istore_1
         *  8 getstatic #2 <java/lang/System.out>
         * 11 iload_1
         * 12 invokevirtual #6 <java/io/PrintStream.println>
         * 15 return
         */
    }

    public void method9() {
        double d = 0.0;
        double d2 = d++;
        System.out.println(d);//1.0
        System.out.println(d2);//0.0
    }


}
