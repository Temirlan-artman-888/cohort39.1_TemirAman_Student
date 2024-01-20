import lesson_25.IncorrectFigureSizeException;

public class HomeWork {
    public static void main(String[] args) throws IncorrectFigureSizeException {}

    public static double calculateRoundCircleArea(double[] radius) throws IncorrectFigureSizeException {
        if (radius.length > 1) {
            throw new IncorrectFigureSizeException("You can not put over 1 variable for this method");
        }
        if (radius[0] <= 0) {
            throw new IncorrectFigureSizeException("Wrong variables of circle");
        }

        double resultCalculateArea = (Math.PI * radius[0] * radius[0]);
        System.out.println("Площадь круга: " + resultCalculateArea);
        return Math.PI * radius[0] * radius[0];
    }

    public static double calculateRectangleArea(double[] values) throws IncorrectFigureSizeException {
        if (values[0] != values[1]) {
            throw new IncorrectFigureSizeException("This type of rectangle does not exist due to the rule, " +
                    "All opposites are equal");
        }
        if (values[0] <= 0 || values[1] <= 0 && values.length > 2) {
            throw new IncorrectFigureSizeException("Wrong variables of triangle");
        } else {
            System.out.println("Площадь прямоугольника : " + (values[0] * values[1]));
        }
        return values[0] * values[1];
    }

    public static double calculateTriangleArea(double[] triangleValues) throws IncorrectFigureSizeException {
        if (triangleValues.length > 3) {
            throw new IncorrectFigureSizeException("The length are over 3 variables");
        }
        if (triangleValues[0] <= 0 || triangleValues[1] <= 0 || triangleValues[2] <= 0) {
            throw new IncorrectFigureSizeException("Wrong variables for triangle");
        }

        double semiPerimeter = (triangleValues[0] + triangleValues[1] + triangleValues[2]) / 2;
        double resultSemiPerimeter = Math.sqrt(semiPerimeter * (semiPerimeter - triangleValues[0]) *
                (semiPerimeter - triangleValues[1]) * (semiPerimeter - triangleValues[2]));
        System.out.println("Площадь треугольника: " + resultSemiPerimeter);
        return resultSemiPerimeter;
    }
}

