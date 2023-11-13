public class User {
    String username;
    String password;
    String name;

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
        if (password.length() < 8)
            System.out.println("Password must be at least 8 characters");
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
}
