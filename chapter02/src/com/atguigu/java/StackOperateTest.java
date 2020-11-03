package com.atguigu.java;

/**
 * 指令6:操作数栈管理指令 pop pop2 dup dup2 dup_x1 dup2_x1 dup_x2 dup2_x2 swap
 */
public class StackOperateTest {
    private long index = 0;

    public void print() {
        Object obj = new Object();
//        String info = obj.toString();
        obj.toString();// pop
    }

    //类似的
    public void foo() {
        bar();
    }

    public long bar() {
        return 0;
    }

    public long nextIndex() {
        return index++;
    }
}