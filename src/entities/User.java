package entities;

/**
 * Created by Nikita on 29.09.2016.
 */
public class User {

    private int id;

    private String email;

    private boolean isRegistred;

    public User() {
    }

    public User(int id, String email, boolean isRegistred) {
        this.id = id;
        this.email = email;
        this.isRegistred = isRegistred;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", isRegistred=" + isRegistred +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getRegistred() {
        return isRegistred;
    }

    public void setRegistred(boolean registred) {
        isRegistred = registred;
    }
}
