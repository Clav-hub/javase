package classdemo;

/**
 * Question 1
 * 1 对象是类的实例化的结果
 * 2 类分为属性和方法 属性为对象所具有的特性 方法为对象能实现的功能
 * 3 在 mian函数中 new 对象   使用点 点出方法
 * 4 成员变量在方法之外 类之内  存在堆中   有初始值
 *   局部变量在方法之内       存在栈中    没有初始值
 * 5 构造方法 提供 初始化
 *   成员方法 提供 功能
 */
public class Circle {
  private int r;

    public Circle(){}

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void    showCArea(){
        double area=0;
        area = Math.PI*r*r;
        System.out.println("R: "+r + " ,Area: " +area);
    }

    public void showPerimeter(){
        double perimeter=0;
          perimeter = 2*Math.PI*r;
        System.out.println("R: "+r + " ,Perimeter: " +perimeter);
    }

}

