package L5task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedCalculatorTest {
    double number1 = 10;
    double number2 = 5;

    @Test
    void calculateAddition() {
        MathOperation addition = new Addition();
        EnhancedCalculator calculator = new EnhancedCalculator(addition);
        double expectedResult = 15;
        double result = calculator.calculate(10, 5);
        assertEquals(expectedResult, result);
    }

    @Test
    void calculateSubtraction() {
        MathOperation subtraction = new Subtraction();
        EnhancedCalculator calculator = new EnhancedCalculator(subtraction);
        double expectedResult = 5;
        double result = calculator.calculate(10, 5);
        assertEquals(expectedResult, result);
    }

    @Test
    void calculateMultiplication() {
        MathOperation multiplication = new Multiplication();
        EnhancedCalculator calculator = new EnhancedCalculator(multiplication);
        double expectedResult = 50;
        double result = calculator.calculate(10, 5);
        assertEquals(expectedResult, result);
    }

    @Test
    void calculateDivision() {
        MathOperation division = new Division();
        EnhancedCalculator calculator = new EnhancedCalculator(division);
        double expectedResult = 2;
        double result = calculator.calculate(10, 5);
        assertEquals(expectedResult, result);
    }
}