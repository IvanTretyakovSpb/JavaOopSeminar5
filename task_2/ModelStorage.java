package seminar_5.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ModelStorage {
    List<ModelUser> usersBase;

    ModelStorage() {
        usersBase = new ArrayList<>();
    }

    void addUserToStorage(ModelUser user) {
        usersBase.add(user);
    }

    ModelUser getUserData(int userId) {
        for (ModelUser user : usersBase) {
            if (userId == user.getUserId()) {
                return user;
            }
        }
        return null;
    }

    void enterUser(String login, String password) {
        for (ModelUser user : usersBase) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                System.out.println("===".repeat(20));
                System.out.println("Поздравляем! Вы вошли в приложение!");
                System.out.println("===".repeat(20));
                return;
            }
        }
        System.out.println("Неверно введен логин и(или) пароль!");
    }

    void changeUserPassword(String login, String oldPassword, String newPassword) {
        for (ModelUser user : usersBase) {
            if (login.equals(user.getLogin()) && oldPassword.equals(user.getPassword())) {
                user.setPassword(newPassword);
                System.out.println("===".repeat(20));
                System.out.println("Пароль успешно изменен!");
                System.out.println("===".repeat(20));
                return;
            }
        }
        System.out.println("Неверно введен логин и(или) пароль пользователя!");
    }

    void replaceUser(String login, String password) {
        for (int i = 0; i < usersBase.size(); i++) {
            if (usersBase.get(i).getLogin().equals(login) && usersBase.get(i).getPassword().equals(password)){
                usersBase.remove(i);
                System.out.println("===".repeat(20));
                System.out.println("Пользователь успешно удален!");
                System.out.println("===".repeat(20));
                return;
            }
        }
        System.out.println("Неверно введен логин и(или) пароль пользователя!");
    }
}