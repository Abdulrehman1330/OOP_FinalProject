import java.awt.*;


public class Menu extends Frame{
    private TextField usernameField;
    private TextField passwordField;

    public Menu() {

        setTitle("Login or Register");
        setSize(300, 150);
        setLayout(new FlowLayout());



        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");

        add(loginButton);
        add(registerButton);


    }

    public void login(){
        setTitle("Login");
        setSize(300, 150);
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Username:");
        usernameField = new TextField(20);
        Label passwordLabel = new Label("Password:");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);


    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getActionCommand().equals("Login")) {
//            .showMessageDialog(this, "Button 1 clicked!");
//    }
}