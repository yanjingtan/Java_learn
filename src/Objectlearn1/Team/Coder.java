package Objectlearn1.Team;
/*
五.定义两个类，经理类 Manager，程序员类Coder

1. Coder 类：
2. 属性：姓名，工号，薪资
3. 构造方法：无参构造方法，满参构造方法
4. 成员方法：get/set 方法、intro 方法：打印姓名，工号信息、showSalary 方法：打印薪资信息、work 方法：打印工作信息

IntelliJ IDEA生成get/set有2种方式，alt+enter(不行)、alt+insert。下面分别介绍这2种方式快速生成get与set方法
 */
public class Coder {
    private String name;
    private int number;
    private int salary;
    public Coder(String name,int number,int salary){
        setName(name);
        setNumber(number);
        setSalary(salary);
    }
    public void intro(){
        System.out.println("Name:"+name+" "+"Number:"+number);
    }
    public void showSalary(){
        System.out.println("Salary:"+salary);
    }
    public void showWork(){
        System.out.println("Work Data");
        System.out.println("Number"+number);
        System.out.println("Salary:"+salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
