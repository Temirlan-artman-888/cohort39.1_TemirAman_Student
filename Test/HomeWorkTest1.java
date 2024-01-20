import lesson_25.IncorrectFigureSizeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeWorkTest1 {

    @Test
    void calculateRoundCircleArea() throws IncorrectFigureSizeException {
        double expected = 78.53981633974483;

        double result = HomeWork.calculateRoundCircleArea(new double[]{5});
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateRectangleArea() throws IncorrectFigureSizeException {
        double expected = 25;

        double result = HomeWork.calculateRectangleArea(new double[]{5, 5});
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateTriangleArea() throws IncorrectFigureSizeException {
        double expected = 1.7320508075688772;
        double result = HomeWork.calculateTriangleArea(new double[]{2, 2, 2});
        Assertions.assertEquals(expected, result);
    }
}