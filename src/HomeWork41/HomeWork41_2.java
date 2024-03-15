package HomeWork41;

public class HomeWork41_2 {
    public static void main(String[] args) {
        String input = "Какой замечательный, однако, день!";
        String lowerCamelCase = toLowerCamelCase(input);
        System.out.println("Строка в стиле lowerCamelCase: " + lowerCamelCase);

        String reverse = fromLowerCamelCase(lowerCamelCase);
        System.out.println("Обратное преобразование: " + reverse);
    }

    // Метод преобразует строку в стиле lowerCamelCase
    public static String toLowerCamelCase(String input) {
        // Удаляем все символы, кроме букв и пробелов
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я\\s]", "");
        // Разбиваем строку на слова
        String[] words = cleaned.split("\\s+");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        // Приводим первую букву каждого слова (кроме первого) к верхнему регистру и добавляем к результату
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }

    // Метод обратного преобразования из стиля lowerCamelCase
    public static String fromLowerCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        // Проходим по всей строке
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Если текущий символ - заглавная буква, добавляем пробел перед ней
            if (Character.isUpperCase(c)) {
                result.append(" ");
            }
            // Добавляем текущий символ к результату
            result.append(c);
        }
        return result.toString();
    }
}

