package Calculator.Calculations;

public class Sum implements Calculation {
    @Override
    public double calculate(int number1, int number2) {
        return number1 + number2;
    }
}
