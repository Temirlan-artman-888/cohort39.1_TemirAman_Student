package HomeWork44;

public class HomeWork44 {
    public static void main(String[] args) {
        // Создание и запуск потоков
        Thread thread1 = new MyThread("Thread-1", Thread.MIN_PRIORITY);
        Thread thread2 = new MyThread("Thread-2", Thread.NORM_PRIORITY);
        Thread thread3 = new MyThread("Thread-3", Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    // Пользовательский класс потока
    static class MyThread extends Thread {
        public MyThread(String name, int priority) {
            super(name); // Установка имени потока
            setPriority(priority); // Установка приоритета потока
        }

        public void run() {
            while (true) {
                // Вывод имени и приоритета потока
                System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
            }
        }
    }
}
