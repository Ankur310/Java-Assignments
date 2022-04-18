package Question_1;

import Question1_PartB.Strategy;

public class SubtractingNums implements Strategy {

    @Override
    public int PerformOperation(int num1, int num2) {

        return num1-num2;
    }
}
