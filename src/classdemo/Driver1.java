package classdemo;

public class Driver1 {
    public static void main(String[] args) {
       //Q2
        Circle circle = new Circle(8);
        circle.showCArea();
        circle.showPerimeter();

        System.out.println();
       //Q3
        MyDate myDate = new MyDate(2000,6,30);
        myDate.showDate();
        myDate.isBi();

        System.out.println();

        //Q4
        Card card = new Card("黑桃","A");
        card.showCard();

        System.out.println();

        //Q5
        Manager manager = new Manager("Dal",40044,5000,900);
        manager.intro();
        manager.showSalary();
        manager.work();

        System.out.println();
        Coder coder = new Coder("James",1233,4500);
        coder.intro();
        coder.showSalary();
        coder.work();

        System.out.println();
        //Q6
        Teacher teacher =new Teacher("Kobe",30,"teach");
        teacher.setContent("teaches");
        teacher.eat();
        teacher.content();

        System.out.println();
        Student student = new Student("Mary",12,"study");
        student.setContent("studies");
        student.eat();
        student.content();
    }

}
