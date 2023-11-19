import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String name;

    private ArrayList<Models> cars = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String username, String password, String name) {
        setUsername(username);
        setPassword(password);
        setName(name);
    }

    public boolean CheckPassword(String password){
        if(this.password.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }

    public void addCar(Models m){
        cars.add(m);
    }

    @Override
    public String toString() {
        return "USERNAME : " +username+ " " + "PASSWORD: " + password + " " + "NAME : " + name;
    }
}
