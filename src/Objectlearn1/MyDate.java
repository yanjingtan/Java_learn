package Objectlearn1;
/*
* 三.定义一个日期 MyDate类。

1. 属性：year ：年、month ：月、day ：日
2. 构造方法：满参构造方法
3. 成员方法：get/set 方法、showDate 方法：打印日期。isBi 方法：判断当前日期是否是闰年
4. 定义测试类，创建 MyDate对象，并测试。
5. 代码实现，效果如图所示：
* */
public class MyDate {
    int year;
    int month;
    int day;
    public boolean isBi(){
        //四年一闰；百年不闰，四百年再闰
        return (year%400==0)||(year%4==0&&year%100!=0);
    }
    public void showDate(){
        System.out.println(year+"-"+month+"-"+day);
    }
    public MyDate(int y,int m,int d){
        setYear(y);
        setMonth(m);
        setDay(d);
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
