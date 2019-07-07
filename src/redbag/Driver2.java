package redbag;

public class Driver2 {
    public static void main(String[] args) {
        Master master = new Master("dal",100);
        Member member1 = new Member("Jame",1000);
        Member member2 = new Member("a",2000);
        double[] redbags = master.send(10,2);
        member1.open(redbags);
        member2.open(redbags);
        System.out.println( master.showmessgae());
        System.out.println(member1.showmessgae());
        System.out.println( member2.showmessgae());
    }
}
