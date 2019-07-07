package redbag;

public class Master extends  User {
    public Master(String username, double rest) {
        super(username, rest);
    }

    public double[] send(double money,int count){
        if (money>this.getRest()){
            return null;
        }
        double[] redbags = new double[count];
        for (int i = 0; i <count ; i++) {
            redbags[i] = money/count;
        }
        this.setRest(this.getRest()-money);
        return redbags;
    }
}
