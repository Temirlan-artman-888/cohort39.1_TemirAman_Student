package HomeWork43;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork43 {
    public static void main(String[] args) {
        // Пути к файлам
        String filePath1 = "/Users/macbookpro/Desktop/IntelliJ/cohort39.1_TemirAman_Student/src/HomeWork42/file1.txt";
        String filePath2 = "/Users/macbookpro/Desktop/IntelliJ/cohort39.1_TemirAman_Student/src/HomeWork42/file2.txt";

        // Создание и запуск потоков для чтения из файлов
        Thread reader1 = new ReaderThread(filePath1);
        Thread reader2 = new ReaderThread(filePath2);
        reader1.start();
        reader2.start();
    }

    // Поток для чтения из файла
    static class ReaderThread extends Thread {
        private String filePath;

        public ReaderThread(String filePath) {
            this.filePath = filePath;
        }

        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                // Чтение и вывод содержимого файла
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

