package parser;

import org.junit.Test;
import stack.EmptyStackException;

import static org.junit.Assert.assertEquals;

/**
 * Created by erafiil on 25.06.15.
 */
public class ExpressionParserTest {


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

    @Test
    public void testGetTokens() {
        expressionParser = new ExpressionParser("(2 * (2 - 1.5) + 10 / 2.5)");
        String expectedTokens[] = {"(", "2", "*", "(", "2", "-", "1.5", ")", "+", "10", "/", "2.5", ")"};
        String actualTokens[]   = expressionParser.splitExpression();
        final int ACTUAL_TOKENS_ARRAY_SIZE = expectedTokens.length;
        for (int i = 0; i < ACTUAL_TOKENS_ARRAY_SIZE; i++) {
            assertEquals(expectedTokens[i], actualTokens[i]);
        }
    }

    private ExpressionParser expressionParser;
}