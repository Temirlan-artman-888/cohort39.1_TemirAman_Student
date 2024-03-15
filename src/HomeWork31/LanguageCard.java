package HomeWork31;

import java.util.HashMap;
import java.util.Map;

public class LanguageCard {
    private Map<String, String> wordMap = new HashMap<>();
    private Map<String, Integer> mistakeCountMap = new HashMap<>();

    public LanguageCard() {
        wordMap = new HashMap<>();
        mistakeCountMap = new HashMap<>();
    }

    // Метод для добавления слова и его перевода в мапу
    public void addWord(String word, String translation) {
        wordMap.put(word, translation);
    }

    // Метод для добавления неправильного ответа на слово
    public void addMistake(String word) {
        mistakeCountMap.put(word, mistakeCountMap.getOrDefault(word, 0) + 1);
    }

    // Геттер для получения перевода слова
    public String getTranslation(String word) {
        return wordMap.get(word);
    }

    // Геттер для получения количества неправильных ответов на слово
    public int getMistakeCount(String word) {
        return mistakeCountMap.getOrDefault(word, 0);
    }

    public static void main(String[] args) {
        LanguageCard card = new LanguageCard();
        card.addWord("apple", "яблоко");
        card.addWord("banana", "банан");
        card.addWord("orange", "апельсин");

        // Добавляем неправильные ответы
        card.addMistake("apple");
        card.addMistake("apple");
        card.addMistake("banana");
        card.addMistake("banana");
        card.addMistake("orange");

        // Выводим перевод слова и количество неправильных ответов на него
        System.out.println("Translation of 'apple': " + card.getTranslation("apple"));
        System.out.println("Mistake count for 'apple': " + card.getMistakeCount("apple"));

        System.out.println("Translation of 'banana': " + card.getTranslation("banana"));
        System.out.println("Mistake count for 'banana': " + card.getMistakeCount("banana"));

        System.out.println("Translation of 'orange': " + card.getTranslation("orange"));
        System.out.println("Mistake count for 'orange': " + card.getMistakeCount("orange"));


    }
}

