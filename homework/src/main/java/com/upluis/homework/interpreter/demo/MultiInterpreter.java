package com.upluis.homework.interpreter.demo;

/**
 * Created by Tom.
 */
public class MultiInterpreter extends Interpreter {

    public MultiInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left,right);
    }
    @Override
    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }

}
