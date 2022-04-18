package Question_1;

import Question1_PartB.Strategy;

public class Context {
    public Strategy strategy;

    public Context(Strategy strategy){

        this.strategy = strategy;
    }

    public int getStrategy(int a, int b){

        return strategy.PerformOperation(a,b);
    }
}
