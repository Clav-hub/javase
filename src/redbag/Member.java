package redbag;

public class Member extends User{
    public Member(String username, double rest) {
        super(username, rest);
    }

    public double open(double[] redbag){
        this.setRest(this.getRest()+redbag[0]);
        return redbag[0];
    }
}
