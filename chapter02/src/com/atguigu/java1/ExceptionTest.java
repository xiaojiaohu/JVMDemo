package com.atguigu.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author shkstart
 * @create 2020-09-08 11: 30
 * 指令8:异常处理
 */
public class ExceptionTest {
    public void throwZero(int i) {
        if (i == 0) {
            throw new RuntimeException(" Ë 1ËÏ 7J0");
        }
    }

    public void throwOne(int i) throws RuntimeException {
        if (i == 1) {
            throw new RuntimeException("E í/1");
        }
    }

    public void throwArithmetic() {
        int i = 10;
        int j = i / 0;
        System.out.println(j);
    }

    //try-catch try-finally try-catch-finally异常表
    public void tryCatch(){
        try {
            File file = new File("");
            FileInputStream fis = new FileInputStream(file);
            String info = "hello!";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    //思考:如下方法返回结果为多少?
    public static String func() {
        String str = "hello";
        try{
            return str;
        }
        finally{
            str = "atguigu";
        }
    }
    public static void main(String[] args) {
        System. out. println(func());//hello
    }






}