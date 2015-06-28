package calclulate;

/**
 * Created by erafiil on 28.06.15.
 */
public class SubCalculator implements ICalculator {

    @Override
    public String execute(double a, double b) {
        return String.valueOf(a - b);
    }

    @Override
    public String execute(double a) {
        return String.valueOf(a);
    }
}
