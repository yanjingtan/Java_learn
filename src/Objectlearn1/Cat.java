package Objectlearn1;

import java.util.Scanner;

/*
定义一个猫 Cat类。

1. 属性：年龄 int类型，颜色char类型
2. 构造方法：无参构造方法，满参构造方法
3. 成员方法：get/set 方法、showMsg 方法：打印猫的属性信息
4. 定义测试类，main 方法中，使用满参构造方法，创建Cat对象。
5. 测试类中，定义比较方法，判断两只猫属性是否完全一样。属性完全相同返回 true，一旦不同则返回false。

 */
public class Cat {
    private int age;
    char color;
    public Cat(int a,char c){
        setAge(a);
        setColor(c);
    }
    public Cat(){
        Scanner cin=new Scanner(System.in);
        System.out.println("Age:");
        setAge(cin.nextInt());
        System.out.println("Color:");
        //char c=(char)System.in.read();
        setColor(cin.next().charAt(0));
    }

    public char getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(char color) {
        this.color = color;
    }
}

