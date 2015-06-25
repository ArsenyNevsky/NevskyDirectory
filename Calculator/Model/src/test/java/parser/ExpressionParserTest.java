package parser;

import junit.framework.Assert;
import org.junit.Test;
import stack.EmptyStackException;

/**
 * Created by erafiil on 25.06.15.
 */
public class ExpressionParserTest {

    @Test
    public void testGetExpression() throws Exception {
        expressionParser = new ExpressionParser();
        String expression = "((1*2))";
        expressionParser.setArithmeticExpression(expression);
        Assert.assertEquals(expression, expressionParser.getExpression());
    }

    @Test
    public void testCheckBracketsCount1() throws ExpressionParserException, EmptyStackException {
        System.out.println("testCheckBracketsCount1");
        expressionParser = new ExpressionParser("(1-2)-(2)(2)(10/d8)");
        expressionParser.parse();
    }

    @Test
    public void testCheckBracketsCount2() throws ExpressionParserException, EmptyStackException {
        System.out.println("testCheckBracketsCount2");
        expressionParser = new ExpressionParser("()");
        expressionParser.parse();
    }

    @Test
    public void testCheckBracketsCount3() throws ExpressionParserException, EmptyStackException {
        System.out.println("testCheckBracketsCount3");
        expressionParser = new ExpressionParser("((");
        expressionParser.parse();
    }

    private ExpressionParser expressionParser;
}