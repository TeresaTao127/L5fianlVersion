package L5task3;

public class EnhancedCalculator {

    private MathOperation mathOperation;

    public EnhancedCalculator(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double calculate(double number1, double number2) {
        return mathOperation.calculate(number1, number2);
    }
}