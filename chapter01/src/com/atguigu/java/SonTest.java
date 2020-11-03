package com.atguigu.java;
/*
成员变量（非静态的）的赋值过程：
 ① 默认初始化 -
 ② 显式初始化 /代码块中初始化 -
 ③ 构造器中初始化 -
 ④ 有了对象之后，可以“对象.属性”或"对象.方法" 的方式对成员变量进行赋值。
 */
public class SonTest {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.x);

        System.out.println("-------------------------------");

        Father f1 = new Son();
        System.out.println(f1.x);//属性不存在多态性 字节码中：38 getfield #5 <com/jvm/java/Father.x>
    }

}


class Father {
    int x = 10; //显式初始化

    public Father() {//构造器中初始化
        this.print();
        x = 20;
    }

    public void print() {
        System.out.println("Father.x= " + x);
    }
}

class Son extends Father {
    int x = 30;

    public Son() {
        this.print();
        x = 40;

    }

    public void print() {
        System.out.println("Son.x= " + x);
    }
}
