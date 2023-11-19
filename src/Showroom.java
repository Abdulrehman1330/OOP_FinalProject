import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Showroom {
    static ArrayList<User> users = new ArrayList<>();
    ArrayList<Models> cars = new ArrayList<>();

    public static void addNewUser(String name,String username,String password){
        int flag = 1;
        while (flag == 1) {
            try {
                if(name.isEmpty()){
                    System.out.println("please enter valid input!");
                    continue;
                }
                if(username.isEmpty()){
                    System.out.println("please enter valid input!");
                    continue;
                }
                if (password.length() < 8){
                    System.out.println("Password length must be at least 8 character");
                    continue;
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input, please enter again!");
                continue;
            }
            users.add(new User(username,password,name));
            flag = -1;
        }
        System.out.println(users.get(0));
    }
    public boolean login(String username, String password){
        int flag = 1;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("welcome" + user.getName());
                flag = 0;
                return true;
            }
            if (user.getUsername().equals(username)&& !user.getPassword().equals(password)){
                System.out.println("Invalid Password");
                flag = 0;
                return false;
            }
        }
        if (flag == 1){
            System.out.println("No user found");
        }
        return false;
    }

}
