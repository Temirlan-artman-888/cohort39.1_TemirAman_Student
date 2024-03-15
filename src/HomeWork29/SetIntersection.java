package HomeWork29;

import java.util.HashSet;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("kiwi");
        set2.add("grape");

        Set<String> intersection = findIntersection(set1, set2);
        System.out.println("Intersection: " + intersection);
    }

    public static Set<String> findIntersection(Set<String> set1, Set<String> set2) {
        // Создаем новое множество для хранения пересечения
        Set<String> intersection = new HashSet<>();

        // Перебираем элементы первого множества
        for (String element : set1) {
            // Если элемент присутствует в обоих множествах, добавляем его в пересечение
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }

        return intersection;
    }
}
