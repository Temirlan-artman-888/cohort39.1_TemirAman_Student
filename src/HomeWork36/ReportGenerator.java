package HomeWork36;

public class ReportGenerator {
    private String data;

    public ReportGenerator(String data) {
        this.data = data;
    }

    public String generate() {
        return  "Generated data = " + data;

    }
}
