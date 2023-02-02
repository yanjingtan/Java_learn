package LanguageBasic;

public class try_var {
    int number1;
    public void vartest(){
        System.out.println("Number1 = " + number1);
    }
    public void var_init(){
        //定义字节型变量
        byte b = 100;
        System.out.println(b);
        //定义短整型变量
        short s = 1000;
        System.out.println(s);
        //定义整型变量
        int i = 123456;
        System.out.println(i);
        //定义长整型变量
        long l = 12345678900L;
        System.out.println(l);
        //定义单精度浮点型变量
        float f = 5.5F;
        System.out.println(f);
        //定义双精度浮点型变量
        double d = 8.5;
        System.out.println(d);
        //定义布尔型变量
        boolean bool = false;
        System.out.println(bool);
        //定义字符型变量
        char c = 'A';
        System.out.println(c);
    }

    public static void main(String[] args) {

        int number1;
        number1 = 10;
        int number2;
        number2 = 20;
        int number3;
        number3 = number1 + number2;
        System.out.println("Number3 = " + number3);
        int number4 = 50;
        int number5 = number4 - number3;
        System.out.println("Number5 = " + number5);
    }
}
