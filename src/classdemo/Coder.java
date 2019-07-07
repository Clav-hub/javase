package classdemo;

public  class Coder extends Emp {
    public Coder() {
    }

    public Coder(String name, int num, int salary) {
        super(name, num, salary);
    }

    @Override
    public void work() {
        System.out.println("Coder");
    }
}
