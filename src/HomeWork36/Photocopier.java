package HomeWork36;

public class Photocopier implements Machine{
    @Override
    public void printDoc() {
        System.out.println("Print method is not supported by Photocopier");
    }

    @Override
    public void scanDoc() {
        System.out.println("Scanning...");
    }

    @Override
    public void faxDoc() {
        System.out.println("Faxing...");
    }
}
