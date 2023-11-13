import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Showroom {
    static ArrayList<User> users = new ArrayList<>();
    ArrayList<Models> cars = new ArrayList<>();

    public static void addNewUser(){
        int flag = 1;
        String name,username,password;
        while (flag == 1) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter your name");
                name = scanner.nextLine();
                if(name.equals("")){
                    System.out.println("please enter valid input!");
                    continue;
                }
                System.out.println("Enter a new username:");
                username = scanner.nextLine();
                if(username.equals("")){
                    System.out.println("please enter valid input!");
                    continue;
                }
                System.out.println("Enter your password:");
                password = scanner.nextLine();
                if(password.equals("")){
                    System.out.println("please enter valid input!");
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

}
