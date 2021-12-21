package behavioral.strategy.calc.client;

import behavioral.strategy.calc.calculator.Calculator;
import behavioral.strategy.calc.strategies.AdditionOperation;
import behavioral.strategy.calc.strategies.DivisionOperation;
import behavioral.strategy.calc.strategies.MultiplicationOperation;
import behavioral.strategy.calc.strategies.SubtractionOperation;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(777, 77);
        System.out.println(calculator.getResult(new AdditionOperation()));
        System.out.println(calculator.getResult(new SubtractionOperation()));
        System.out.println(calculator.getResult(new MultiplicationOperation()));
        System.out.println(calculator.getResult(new DivisionOperation()));
    }
}
