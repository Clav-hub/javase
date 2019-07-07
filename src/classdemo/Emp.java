package classdemo;

public abstract class Emp {
    private String name;
    private int num;
    private int salary;

    public Emp(){};

    public Emp(String name, int num, int salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void intro(){
        System.out.println("Name: "+name+" ,num: "+num);
    }

    public void showSalary(){
        System.out.println("Salary: "+salary);
    }

    public abstract void work();
}
