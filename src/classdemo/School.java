package classdemo;

public abstract class School {
    private  String name;
    private  int age;
    private  String content;

    public School(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat(){
        System.out.println(name+" whose age is "+age+" is eating");
    }
    public  void content(){
        System.out.println(getName()+" whose age is "+getAge()+" "+getContent()+" Java");
    }
}
