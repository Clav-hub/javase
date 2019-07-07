package classdemo;

public  class Manager extends Emp{
    private int bons;

    public Manager(int bons) {
        this.bons = bons;
    }

    public Manager(String name, int num, int salary, int bons) {
        super(name, num, salary);
        this.bons = bons;
    }

    public int getBons() {
        return bons;
    }

    public void setBons(int bons) {
        this.bons = bons;
    }

    @Override
    public void showSalary() {
        super.showSalary();
        System.out.println("Bonus: "+ bons);
        int total=bons+getSalary();
        System.out.println("Totoal: "+total);
    }

    @Override
    public void work() {
        System.out.println("Manager");
    }
}
