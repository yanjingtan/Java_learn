package Objectlearn1;


import java.text.SimpleDateFormat;

public class testClass {

    public boolean TestCatSame(Cat a,Cat b){
        return a.getAge()== b.getAge()&&a.getColor()== b.getColor();
    }



    public static void main(String[] args){

        System.out.println("testClass");

        //testClass t=new testClass();
        //定义测试类，使用满参构造方法，创建三个 Book对象，判断价格最贵的图书，并输出图书信息
        //SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

        Book b1=new Book(23,"hello1","XX-XXXX",10,"2022-01-01");
        Book b2=new Book(23,"hello2","XX-XXXX",2,"2022-01-01");
        Book b3=new Book(23,"hello world","XX-XXXX",0,"2022-01-01");
        b3.showBook();

        /*


        Card card=new Card("red",13);
        card.showCard();

        Cat cat1=new Cat();
        Cat cat2=new Cat(2,'s');
        System.out.println("isCatSame "+t.TestCatSame(cat1,cat2));


        Circle circle=new Circle();
        System.out.println("Area: "+circle.showArea());
        System.out.println("Perimeter: "+circle.showPerimeter());

        MyDate myDate=new MyDate(1900,1,1);
        myDate.showDate();
        System.out.println(myDate.getYear()+" "+myDate.isBi());

        */





    }
}
