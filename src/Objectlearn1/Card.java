package Objectlearn1;
/*
四.定义一个扑克 Card类。

1. 属性：花色、点数
2. 构造方法：满参构造方法
3. 成员方法：showCard 方法：打印牌面信息
4. 定义测试类，创建 Card对象，调用showCard方法。
5. 代码实现，效果如图所示：

 */
public class Card {
    private String color;
    private int value;
    public void showCard(){
        System.out.println("Card Color:"+getColor());
        System.out.println("Card Value:"+getValue());
    }
    public Card(String c, int v){
        setColor(c);
        setValue(v);
    }
    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
