package Objectlearn1;

/*
七，定义一个图书 Book类。

1. 属性：图书编号，书名， ISBN编码，价格，出版日期
2. 构造方法：无参构造方法，满参构造方法
3. 成员方法：get/set 方法、showBook 方法，输出图书信息
4. 定义测试类，使用满参构造方法，创建三个 Book对象，判断价格最贵的图书，并输出图书信息。

 */
public class Book {
    private int number;
    private String name;
    private String code;
    private int price;
    private String date;
    public Book(int number, String name, String code, int price, String date){
        setNumber(number);
        setName(name);
        setPrice(price);
        setDate(date);
        setCode(code);
    }
    public void showBook(){
        System.out.println("Book Data:");
        System.out.println(+number+" "+name+" "+code+" "+price+" "+date);
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
