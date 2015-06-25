package parser;

/**
 * Created by erafiil on 25.06.15.
 */
public class ExpressionParser {

    public ExpressionParser() {}

    public ExpressionParser(String arithmeticExpression) {
        expression = arithmeticExpression;
    }

    public void setArithmeticExpression(String arithmeticExpression) {
        expression = arithmeticExpression;
    }

    private String expression;
}
