package com.atguigu.java1;

/**
 * 指令7：控制跳转指令
 */
public class IfSwitchGotoTest {


    //1 条件跳转指令 ifeq, iflt, ifle, ifne, ifgt, ifge, ifnull, ifnonnull.
    public void compare1() {
        int a = 0;
        if (a == 0) {
            a = 10;
        } else {
            a = 20;
        }
    }

    public boolean compareNull(String str) {
        if (str == null) {
            return true;
        } else {
            return false;
        }
    }

    //结合比较指令 fcmpg fcmpl dcmpg dcmpl lcmp
    public void compare2() {
        float f1 = 9;
        float f2 = 10;
        System.out.println(f1 < f2);
    }

    public void compare3() {
        int i1 = 10;
        long l1 = 20;
        System.out.println(i1 < 11);
    }

    public int compare4(double d) {
        if (d > 50) {
            return 1;
        } else {
            return -1;
        }
    }

    //2.比较条件跳转指令 if_ icmpeq、if_ icmpne、if_ icmplt、if_ icmpgt、if_ icmple、if_ icmpge、if_ acmpeq、if_ acmpne
    public void ifCompare1() {
        int i = 10;
        int j = 20;
        System.out.println(i < j);
    }

    public void ifCompare2() {
        short s1 = 9;
        byte b1 = 10;
        System.out.println(s1 > b1);
    }

    public void ifCompare3() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);
        System.out.println(obj1 != obj2);
    }

    //3.多条件分支跳转 tableswitch
    public void swtich1(int select) {
        int num;
        switch (select) {
            case 1:
                num = 10;
                break;
            case 2:
                num = 20;
                //break;
            case 3:
                num = 30;
                break;
            default:
                num = 40;
        }
    }

    public void swtich2(int select) {
        int num;
        switch (select) {
            case 100:
                num = 10;
                break;
            case 500:
                num = 20;
                //break;
            case 200:
                num = 30;
                break;
            default:
                num = 40;
        }
    }

    //jdk7新特性:引入string类型 会比较hashcode值和equals
    public void swtich3(String season) {
        switch (season) {
            case "SPRING":
                break;
            case " SUMMER":
                break;
            case " AUTUMN":
                break;
            case "WINTER":
                break;
        }
        /**
         *   0 aload_1
         *   1 astore_2
         *   2 iconst_m1
         *   3 istore_3
         *   4 aload_2
         *   5 invokevirtual #11 <java/lang/String.hashCode>
         *   8 lookupswitch 4
         * 	-1842350579:  52 (+44)
         * 	-1734407483:  94 (+86)
         * 	277327414:  80 (+72)
         * 	792435663:  66 (+58)
         * 	default:  105 (+97)
         *  52 aload_2
         *  53 ldc #12 <SPRING>
         *  55 invokevirtual #13 <java/lang/String.equals>
         *  58 ifeq 105 (+47)
         *  61 iconst_0
         *  62 istore_3
         *  63 goto 105 (+42)
         *  66 aload_2
         *  67 ldc #14 < SUMMER>
         *  69 invokevirtual #13 <java/lang/String.equals>
         *  72 ifeq 105 (+33)
         *  75 iconst_1
         *  76 istore_3
         *  77 goto 105 (+28)
         *  80 aload_2
         *  81 ldc #15 < AUTUMN>
         *  83 invokevirtual #13 <java/lang/String.equals>
         *  86 ifeq 105 (+19)
         *  89 iconst_2
         *  90 istore_3
         *  91 goto 105 (+14)
         *  94 aload_2
         *  95 ldc #16 <WINTER>
         *  97 invokevirtual #13 <java/lang/String.equals>
         * 100 ifeq 105 (+5)
         * 103 iconst_3
         * 104 istore_3
         * 105 iload_3
         * 106 tableswitch 0 to 3	0:  136 (+30)
         * 	1:  139 (+33)
         * 	2:  142 (+36)
         * 	3:  145 (+39)
         * 	default:  145 (+39)
         * 136 goto 145 (+9)
         * 139 goto 145 (+6)
         * 142 goto 145 (+3)
         * 145 return
         */
    }

    //4.无条件跳转指令
    public void whileInt() {
        int i = 0;
        while (i < 100) {
            String S = "atguigu. com";
            i++;
        }
    }

    public void whileDouble() {
        double d = 0.0;
        while (d < 100.1) {
            String S = "atguigu. com";
            d++;
        }
    }

    public void printFor() {
        short i;
        for (i = 0; i < 100; i++) {
            String S = "atguigu.com";
        }
    }

    //思考:如下两个方法的操作有何不同? 变量i作用域不同,字节码完全一样
    public void whileTest() {
        int i = 1;
        while (i <= 100) {
            i++;
        }
        //可以继续使用i
    }

    public void forTest() {
        for (int i = 1; i <= 100; i++) {
        }
        //无法继续使用i
    }

    //更进一步
    public void doWhileTest() {
        int i = 1;
        do {
            i++;
        } while (i <= 100);
    }


}
