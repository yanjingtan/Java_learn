package Objectlearn1;

public class testClass {

    public boolean TestCatSame(Cat a,Cat b){
        return a.getAge()== b.getAge()&&a.getColor()== b.getColor();
    }
    public static void main(String[] args){

        System.out.println("testClass");
        testClass t=new testClass();

        Cat cat1=new Cat();
        Cat cat2=new Cat(2,'s');
        System.out.println("isCatSame "+t.TestCatSame(cat1,cat2));


        /*

        Circle circle=new Circle();
        System.out.println("Area: "+circle.showArea());
        System.out.println("Perimeter: "+circle.showPerimeter());

        MyDate myDate=new MyDate(1900,1,1);
        myDate.showDate();
        System.out.println(myDate.getYear()+" "+myDate.isBi());

        */





    }
}
