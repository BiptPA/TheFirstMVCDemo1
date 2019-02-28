package example.pojo;

public class User {
    private int autoid;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    public int getAutoid() {
        return autoid;
    }

    public void setAutoid(int autoid) {
        this.autoid = autoid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
