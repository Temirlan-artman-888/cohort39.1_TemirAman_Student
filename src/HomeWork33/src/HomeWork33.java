import java.io.*;

public class HomeWork33 {
    public static String filePath = "/Users/macbookpro/Desktop/IntelliJ/cohort39.1_TemirAman_Student/src/HomeWork33/src/test.txt";
    public static String fakeFilePath = "/Users/macbookpro/Desktop/IntelliJ/cohort39.1_TemirAman_Student/src/HomeWork33/src/fakeTest.txt";


    public static void main(String[] args) throws Exception {
        String name = requestName();
        tryToWriteToFile(filePath, name);
        readThatFile(filePath);
        isExistFile(fakeFilePath);

    }

    public static void tryToWriteToFile(String newFilePath, String name) {
        try (FileWriter fw = new FileWriter(newFilePath, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Hello, " + name);
            bw.write("\nHello, World\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void readThatFile(String newFileReader) {
        try (FileReader fr = new FileReader(newFileReader); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static String requestName() {
        System.out.println("Enter the name ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    public static void isExistFile(String filePath) throws Exception {
        File isFileExist = new File(filePath);
        if (isFileExist.isFile()){
            System.out.println("File exist");
        }else {
            throw new FileNotFoundException();
        }



    }

}


