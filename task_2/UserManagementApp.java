package seminar_5.task_2;

public class UserManagementApp {
    public static void main(String[] args) {
        ModelStorage storage = new ModelStorage();
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(storage, view);

        presenter.userAction();
    }
}
