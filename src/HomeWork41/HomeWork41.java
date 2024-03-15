package HomeWork41;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос электронного адреса у пользователя
        System.out.println("Введите электронный адрес:");
        String email = scanner.nextLine();

        // Регулярное выражение для проверки электронного адреса
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Создание объекта Pattern
        Pattern pattern = Pattern.compile(regex);

        // Создание объекта Matcher
        Matcher matcher = pattern.matcher(email);

        // Проверка соответствия электронного адреса заданному шаблону
        if (matcher.matches()) {
            System.out.println("Электронный адрес " + email + " верный.");
        } else {
            System.out.println("Электронный адрес " + email + " неверный.");
        }
    }
}

