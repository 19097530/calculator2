package Calculator.Calculations;

public class Divide implements Calculation {
    @Override
    public double calculate(int number1, int number2) {
        return (double)number1 / (double)number2;
    }
}
