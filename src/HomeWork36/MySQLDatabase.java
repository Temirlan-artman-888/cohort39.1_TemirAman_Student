package HomeWork36;

public class MySQLDatabase implements Database{
    @Override
    public void read() {
        System.out.println("Database is reading");
    }

    @Override
    public void write() {
        System.out.println("Database are writing");
    }
}
