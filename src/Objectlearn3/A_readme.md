1.编写一个泛型方法，实现任意引用类型数组指定位置元素交换。

2.编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素。

3.定义方法,遍历传递过来的任意引用类型数组。

练习：

1.编写Order类，有int型的orderId，String型的orderName，相应的getter()和setter()方法，两个参数的构造器，重写父类的equals()方法：public boolean equals(Object obj)，并判断测试类中创建的两个对象是否相等。
2.请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖equals方法，使其判断当两个MyDate类型对象的年月日都相同时，结果为true，否则为false。 public boolean equals(Object o)

4).hashCode方法

返回该对象的哈希码值。

该方法用于哈希查找，可以减少在查找中使用equals的次数，重写了equals方法一般都要重写hashCode方法。这个方法在一些具有哈希功能的Collection中用到。

一般必须满足obj1.equals(obj2)==true。可以推出obj1.hash- Code()==obj2.hashCode()，但是hashCode相等不一定就满足equals。不过为了提高效率，应该尽量使上面两个条件接近等价。

5).getClass方法

返回次Object的运行时类类型。
不可重写，要调用的话，一般和getName()联合使用，如getClass().getName();

6).finalize方法

对象被回收之前要做的事。

7).clone方法

实现对象的浅克隆。

作业
1.简述String类中的equals方法与Object类中的equals方法的不同点。

2."=="和equals方法究竟有什么区别？

3.创建学生类，有姓名学号等属性，重写equals方法，只要姓名及学号相等就就视为同一对象，重写toString方法，格式：学生xxx学号为xxx，创建测试类进行测试。