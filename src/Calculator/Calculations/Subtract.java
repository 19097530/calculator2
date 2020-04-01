package Calculator.Calculations;

public class Subtract implements Calculation {
    @Override
    public double calculate(int number1, int number2) {
        return number1 - number2;
    }
}
