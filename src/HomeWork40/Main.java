package HomeWork40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Regular Polygon");

        int choice = scanner.nextInt();

        Shape shape = null;
        double perimeter = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter the width of the rectangle:");
                double width = scanner.nextDouble();
                System.out.println("Enter the height of the rectangle:");
                double height = scanner.nextDouble();
                shape = new Rectangle(width, height);
                perimeter = shape.getPerimeter();
                break;
            case 2:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                perimeter = shape.getPerimeter();
                break;
            case 3:
                System.out.println("Enter the number of sides of the regular polygon:");
                int numSides = scanner.nextInt();
                System.out.println("Enter the length of each side of the regular polygon:");
                double sideLength = scanner.nextDouble();
                shape = new RegularPolygon(numSides, sideLength);
                perimeter = shape.getPerimeter();
                break;
            default:
                System.out.println("Invalid choice");
        }

        if (shape != null) {
            System.out.println("Perimeter of the chosen shape: " + perimeter);
            // Расчет цены в зависимости от периметра
            double price = calculatePrice(perimeter);
            System.out.println("Price: $" + price);
        }
    }

    // Примерная реализация метода для расчета цены в зависимости от периметра
    private static double calculatePrice(double perimeter) {
        return perimeter * 0.5; // Просто пример, реальная логика может быть другой
    }
}
