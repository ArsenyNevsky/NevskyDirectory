/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 09.10.13
 * Time: 23:32
 * Location: ${Russia_Saint-Petersburg}
 */
public class AnalysisExpression {


    public AnalysisExpression() {
        stackOperation = new Stack<>();
        stackNumber = new Stack<>();
        result = new StringBuilder();
    }


    public void printResult() {
        System.out.println("\n\n\nFROM INFIX TO POSTFIX:     " + result);
        System.out.println("RESULT OF CALCULATION IS      " + stackNumber.pop());
    }


    public void calculation(String expression) {
        String expr = postfix(expression);
        double value = 0;
        for (char symbol : expr.toCharArray()) {
            switch (symbol) {
                case '+':
                    value = stackNumber.pop();
                    value += stackNumber.pop();
                    stackNumber.push(value);
                    break;
                case '-':
                    value = stackNumber.pop();
                    value -= stackNumber.pop();
                    stackNumber.push(value);
                    break;
                case '*':
                    value = stackNumber.pop();
                    value *= stackNumber.pop();
                    stackNumber.push(value);
                    break;
                case '/':
                    value = stackNumber.pop();
                    value /= stackNumber.pop();
                    stackNumber.push(value);
                    break;
                default:
                    stackNumber.push(Double.parseDouble(String.valueOf(symbol)));
                    break;
            }
        }
    }


    private String postfix(String expression) {
        for (char symbol : expression.toCharArray()) {       //"(1+2)*4+3"
            switch (symbol) {
                case '+':
                case '-':
                case '*':
                case '/':
                    if (stackOperation.isEmpty()) {
                        stackOperation.push(symbol);
                        break;
                    } else {
                        if (getPriority(symbol) > getPriority(stackOperation.peek())) {
                            stackOperation.push(symbol);
                        } else {
                            while (!stackOperation.isEmpty() && getPriority(symbol) <= getPriority(stackOperation.peek())) {
                                result.append(stackOperation.pop());
                            }
                            stackOperation.push(symbol);
                        }
                    }
                    break;
                case '(':
                    stackOperation.push(symbol);
                    break;
                case ')':
                    while (!stackOperation.peek().equals('(')) {
                        result.append(stackOperation.pop());
                    }
                    stackOperation.pop();
                    break;
                default:
                    result.append(symbol);
                    break;
            }
        }
        while (!stackOperation.isEmpty()) {
            result.append(stackOperation.pop());
        }

        return result.toString();
    }


    private int getPriority(char symbol) {
        int priority = 0;
        switch (symbol) {
            case '^':
                priority = 3;
                break;
            case '*':
            case '/':
                priority = 2;
                break;
            case '+':
            case '-':
                priority = 1;
                break;
            case '(':
                priority = 0;
                break;
        }
        return priority;
    }


    private StringBuilder result;
    private Stack<Character> stackOperation;
    private Stack<Double> stackNumber;
}
