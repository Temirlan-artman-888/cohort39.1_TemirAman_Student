package HomeWork36;

public class Printer implements Machine{
    @Override
    public void printDoc() {
        System.out.println("Printing...");
    }

    @Override
    public void scanDoc() {
        System.out.println("Scanning...");
    }

    @Override
    public void faxDoc() {
        System.out.println("Fax option out of business :(");
    }
}
