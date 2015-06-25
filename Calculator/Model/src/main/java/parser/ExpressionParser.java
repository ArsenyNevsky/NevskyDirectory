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
        expression = expression.trim();
        try {
            checkBracketsCount();
        } catch (EmptyStackException | ExpressionParserException e) {
            e.getMessage();
        }
    }

    private void checkBracketsCount() throws ExpressionParserException, EmptyStackException {
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

    private Stack<String> stack;
    private String expression;
}
