package Lab7.Task1.Task4;

public class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public boolean login (String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

    public void change (String oldPassword, String newPassword){
        if (this.password.equals(oldPassword)){
            this.password=newPassword;
            System.out.println("Пароль змінено.");
        }
        else {

            System.out.println("Невірний пароль");
        }
    }

    public void changePassword(String oldPassword, String newPassword) {
    }
}