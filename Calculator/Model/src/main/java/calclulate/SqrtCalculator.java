package calclulate;

/**
 * Created by erafiil on 28.06.15.
 */
public class SqrtCalculator implements ICalculator {

    @Override
    public String execute(double a, double b) {
        return null;
    }

    @Override
    public String execute(double a) {
        return String.valueOf(Math.sqrt(a));
    }
}
