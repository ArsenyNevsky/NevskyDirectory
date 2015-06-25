package parser;

import stack.EmptyStackException;
import stack.Stack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public String getExpression() {
        return expression;
    }

    public void parse() {
        try {
            checkBracketsCount();
        } catch (EmptyStackException | ExpressionParserException e) {
            System.out.println(e.getMessage());
        }
        String tokens[] = null;
        try {
            tokens = getTokens();
        } catch (Exception e) {

        }
    }

    protected void checkBracketsCount() throws ExpressionParserException, EmptyStackException {
        Pattern pattern = Pattern.compile("\\(|\\)");
        Matcher matcher = pattern.matcher(expression);
        StringBuilder brackets = new StringBuilder();
        while (matcher.find()) {
            brackets.append(matcher.group());
        }

        stack = new Stack<>();
        for (char bracket : brackets.toString().toCharArray()) {
            if (bracket == '(') {
                stack.push("(");
            } else {
                stack.pop();
            }
        }

        if (!stack.isEmptyStack()) {
            throw new ExpressionParserException(Messages.getMessage("expressionParser.checkBracketsCount.error"));
        }
    }

    /**
     *
     * (1+2) * 3 - 40 / 2.5 - 15
     */
    protected String[] getTokens() {
        Pattern pattern = Pattern.compile("[0-9]+\\.?[0-9]+|[0-9]+|\\(|\\)|\\+|\\-|\\*|\\/");
        Matcher matcher = pattern.matcher(expression);
        StringBuilder tokens = new StringBuilder();
        while (matcher.find()) {
            tokens.append(matcher.group() + ",");
        }
        return tokens.toString().split(",");
    }

    private Stack<String> stack;
    private String expression;
}
