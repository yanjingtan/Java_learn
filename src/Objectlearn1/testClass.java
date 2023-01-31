package Objectlearn1;

import Objectlearn2.*;
import Objectlearn2.Team.Coder;
import Objectlearn2.Team.Manager;


import java.text.SimpleDateFormat;

public class testClass {

    public boolean TestCatSame(Cat a,Cat b){
        return a.getAge()== b.getAge()&&a.getColor()== b.getColor();
    }



    public static void main(String[] args){

        System.out.println("testClass");

        //testClass t=new testClass();


        /*
        Coder coder=new Coder("a",120,1233);
        Manager manager=new Manager("b",122,2333);
        coder.showSalary();
        manager.showSalary();

        Book b1=new Book(23,"hello1","XX-XXXX",10,"2022-01-01");
        Book b2=new Book(23,"hello2","XX-XXXX",2,"2022-01-01");
        Book b3=new Book(23,"hello world","XX-XXXX",0,"2022-01-01");
        b3.showBook();
        //SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");


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
