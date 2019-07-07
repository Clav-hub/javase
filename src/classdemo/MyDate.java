package classdemo;

public class MyDate {
    private int year;
    private int month;
    private int day;




    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate(){
        System.out.println("The date is: "+year+" ,"+ month+" , "+day);
    }

    public void isBi(){
        if (( year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println("闰年");

        }else {
            System.out.println("不是闰年");
        }

    }
}
