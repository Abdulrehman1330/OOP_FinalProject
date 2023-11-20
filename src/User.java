import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String name;
    private String gender;
    private int ID;
    private String email;
    private int number;

    public User(String username, String password, String name, String gender, int ID, String email, int number, ArrayList<Models> cars) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.email = email;
        this.number = number;
        this.cars = cars;
    }

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


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Models> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Models> cars) {
        this.cars = cars;
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
