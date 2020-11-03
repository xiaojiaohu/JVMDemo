package com.atguigu.java1;

import java.io.*;

/**
 * 测试类的主动使用:意味着会调用<clinit>()方法,即执行了类的初始化阶段
 * <p>
 * 1.当创建一个类的实例时，比如使用 new 关键字，或者通过反射、克隆、反序列化
 * 2.当调用类的静态方法时，即当使用了字节码 invokestatic 指令
 * */
public class ActiveUse1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 1、new 对象
//        Order order = new Order();
        //1、反射获取对象
//        Class<?> aClass = Class.forName("com.atguigu.java1.Order");
//        Order o = (Order) aClass.newInstance();

        //1、反序列化获取对象
//        ActiveUse1 a = new ActiveUse1();
//        a.test1();
//        a.test2();
    }

    //序列化的过程
    public void test1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Order.dat"));

            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }


    //反序列化过程（验证）
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Order.dat"));
            Order o = (Order) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }


    //2
    public void test3(){
        Order.method();
    }


}

class Order implements Serializable{
    static {
        System.out.println("Order类的初始化过程");
    }

    public static void method(){
        System.out.println("Order method()...");
    }
}