package redbag;

public class User {
    private String username;
    private double rest;
    public User(){}

    public User(String username, double rest) {
        this.username = username;
        this.rest = rest;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getRest() {
        return rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }


    public String showmessgae() {
        return "User{" +
                "username='" + username + '\'' +
                ", rest=" + rest +
                '}';
    }
}
