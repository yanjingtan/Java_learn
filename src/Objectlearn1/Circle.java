package Objectlearn1;
/*
二.定义一个圆形 Circle类。

属性：r ：半径

构造方法：无参构造方法、满参构造方法

成员方法：get/set 方法、showArea 方法：打印圆形面积、showPerimeter 方法：打印圆形周长

定义测试类，创建 Circle对象，并测试。

代码实现，效果如图所示：
 */
//import java.util.*;
import java.util.Scanner;
/*
public： Java语言中访问限制最宽的修饰符，一般称之为“公共的”。被其修饰的类、属性以及方法不
　　　　　仅可以跨类访问，而且允许跨包（package）访问。
private: Java语言中对访问权限限制的最窄的修饰符，一般称之为“私有的”。被其修饰的类、属性以
　　　　　及方法只能被该类的对象访问，其子类不能访问，更不能允许跨包访问。
protect: 介于public 和 private 之间的一种访问修饰符，一般称之为“保护形”。被其修饰的类、
　　　　　属性以及方法只能被类本身的方法及子类访问，即使子类在不同的包中也可以访问。
default：即不加任何访问修饰符，通常称为“默认访问模式“。该模式下，只允许在同一个包中进行访
　　　　　问。
————————————————
版权声明：本文为CSDN博主「LANGZI7758521」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/langzi7758521/article/details/51917646
 */

public class Circle {
    int r;
    public Circle() {
        Scanner cin = new Scanner(System.in);
        r = cin.nextInt();
    }
    public Circle(int x){
        r=x;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public double showArea(){
        //求面积
        return Math.PI*(r*r);
    }
    public double showPerimeter(){
        return Math.PI*(2*r);
    }

}
