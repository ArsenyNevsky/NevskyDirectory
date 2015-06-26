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

    public String[] getTokens() {
        return tokens;
    }

    public void parse() {
        try {
            checkBracketsCount();
        } catch (EmptyStackException | ExpressionParserException e) {
            System.out.println(e.getMessage());
        }
        try {
            tokens = splitExpression();
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            throw new ExpressionParserException(Message.getMessage("expressionParser.checkBracketsCount.error"));
        }
    }

    /**
     *
     * By using regular expressions, a method return an array of tokens <br>
     * that contains such items as +, -, /, *, brackets ( ) and numbers
     */
    protected String[] splitExpression() {
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
    private String[] tokens;
}
