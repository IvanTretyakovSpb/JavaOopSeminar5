package seminar_5.task_2;

import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);

    char getAction() {
        System.out.println("___".repeat(20));
        System.out.println("""
                Выберите дальнейшее действие:
                1 - Регистрация нового пользователя.
                2 - Вход в приложение действующего пользователя.
                3 - Показать данные пользователя по его номеру ID.
                4 - Изменить пароль пользователя.
                5 - Удалить пользователя.
                6 - Выход из приложения.""");
        System.out.println("___".repeat(20));
        return scanner.next().charAt(0);
    }

    //    метод для вывода информации о пользователе
    public void displayUserInfo(ModelUser user) {
        System.out.printf("ID: %d, name: %s, login: %s, password: %s\n\n", user.getUserId(), user.getName(),
                user.getLogin(), user.getPassword());
    }

    //    метод для запроса текстовой информации у пользователя
    public String getStringInfoFromUser(String message) {
        System.out.printf("Введите %s пользователя: ", message);
        return scanner.next();
    }




}
