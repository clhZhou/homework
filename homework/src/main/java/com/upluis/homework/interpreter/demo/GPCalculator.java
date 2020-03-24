package com.upluis.homework.interpreter.demo;

import java.util.Stack;

public class GPCalculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<>();
    private Stack<String> operatorStack = new Stack<>();

    public GPCalculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String [] elements = expression.split(" ");
        IArithmeticInterpreter leftExpr, rightExpr;

        for (int i = 0; i < elements.length ; i++) {
            String operator = elements[i];
            if (OperatorUtil.isOperator(operator)){
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements[++i]));
                this.stack.push(numInterpreter);
                operatorStack.push(operator);
                this.stack.push(OperatorUtil.getInterpreter(stack,operatorStack));
                System.out.println("应用运算符: " + operator);
            }
            else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements[i]));
                this.stack.push(numInterpreter);
                System.out.println("入栈: " + numInterpreter.interpret());
            }
        }
    }

    public int calculate() {
        return this.stack.pop().interpret();
    }
}