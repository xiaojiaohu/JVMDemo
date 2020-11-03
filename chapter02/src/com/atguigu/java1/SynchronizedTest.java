package com.atguigu.java1;

/**
 * 指令9：同步控制指令 monitorenter  monitorexit
 */
public class SynchronizedTest {

    private int i = 0;
    private Object obj = new Object();

    public void add() {
        i++;
    }

    public void subtract() {
        synchronized (obj) {
            i--;
        }
    }
}
