package seminar_5.task_2;

public class ModelUser {
    private String name;
    private String login;
    private String password;
    private int userId;

    private static int count = 0;

    public ModelUser(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        userId = count++;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
