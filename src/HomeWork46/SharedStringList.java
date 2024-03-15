package HomeWork46;

import java.util.ArrayList;
import java.util.List;

public class SharedStringList {
    private List<String> list = new ArrayList<>();

    // Метод для добавления строки в список
    public synchronized void addString(String str) {
        list.add(str);
    }

    // Метод для получения всего списка строк
    public synchronized List<String> getList() {
        return list;
    }
}
