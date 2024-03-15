package HomeWork46;

import java.util.List;

public class HomeWork46 {
    public static void main(String[] args) {
        SharedStringList sharedList = new SharedStringList();
        int numThreads = 5;

        // Создание потоков и запуск
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new AddStringTask(sharedList));
            thread.start();
        }

        // Ожидание завершения всех потоков
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод содержимого списка
        System.out.println("Список строк:");
        List<String> list = sharedList.getList();
        for (String str : list) {
            System.out.println(str);
        }
    }

    // Задача для потоков добавления строк
    static class AddStringTask implements Runnable {
        private SharedStringList sharedList;

        public AddStringTask(SharedStringList sharedList) {
            this.sharedList = sharedList;
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                sharedList.addString(Thread.currentThread().getName() + " - " + i);
            }
        }
    }
}

