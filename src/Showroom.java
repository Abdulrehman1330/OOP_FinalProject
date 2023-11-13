import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {
    static ArrayList<User> users = new ArrayList<>();
    ArrayList<Models> cars = new ArrayList<>();

    public static void addNewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter a new username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        users.add(new User(username,password,name));
        System.out.println(users.get(0));
    }

}
