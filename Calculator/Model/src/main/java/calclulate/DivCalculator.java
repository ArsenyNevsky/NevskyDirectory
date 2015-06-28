package calclulate;

/**
 * Created by erafiil on 28.06.15.
 */
public class DivCalculator implements ICalculator {

    @Override
    public String execute(double a, double b) {
        double result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            return Message.getMessage("calculate.divCalculator.execute.error");
        }
        return String.valueOf(result);
    }

    @Override
    public String execute(double a) {
        return String.valueOf(a);
    }
}
