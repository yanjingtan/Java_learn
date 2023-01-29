package Objectlearn2.Team;
/*
五.定义两个类，经理类 Manager，程序员类Coder

1. Coder 类：
2. 属性：姓名，工号，薪资
3. 构造方法：无参构造方法，满参构造方法
4. 成员方法：get/set 方法、intro 方法：打印姓名，工号信息、showSalary 方法：打印薪资信息、work 方法：打印工作信息

IntelliJ IDEA生成get/set有2种方式，alt+enter(不行)、alt+insert。下面分别介绍这2种方式快速生成get与set方法
 */
public class Coder extends Worker {
    //子类只能继承父类所有非私有的成员(成员方法和成员变量),子类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法。
    //尝试继承Worker

    public Coder(String name,int number,double salary){
        super(name,number,salary);
    }

}
