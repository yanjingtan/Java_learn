package Objectlearn1;
/*
八、定义一个学生类，有学号、年级、分数三个属性，创建20个学生对象，学号1-20，年级和分数随机生成。

1. 打印出年级为3的学生信息。
2. 用冒泡排序按照学生成绩进行排序，并打印。
 */
public class Student {
    private int  number;
    private int  grade;
    private int  point;
    public Student(int number,int grade,int point){
        setNumber(number);
        setGrade(grade);
        setPoint(point);
    }

    public int getNumber() {
        return number;
    }

    public int getGrade() {
        return grade;
    }

    public int getPoint() {
        return point;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
