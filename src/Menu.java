import java.util.Scanner;

public class Menu {

    private int no;

    public void showOptions(){
        System.out.println("Choose an option from following");
        System.out.println("1. Login");
        System.out.println("2. SignUp");
        Scanner scanner = new Scanner(System.in);
        no=scanner.nextInt();
        switch (no){
            case 1:
                break;
            case 2:
                Showroom.addNewUser();
        }
    }


}
