package Question1_PartB;

import Question1_PartB.Strategy;

public class Main {
    public static void main(String[] args) {
       Strategy s1 = (a, b)  ->{
           return a+b;
       };

        int res = s1.PerformOperation(4,6);
        System.out.println(res);


        Strategy s2 = (a,b)->{
            return a-b;
        };
        int res2 = s2.PerformOperation(15,10);
        System.out.println(res2);


        Strategy s3 = (a,b) ->{
            return a*b;
        };

        int res3 = s3.PerformOperation(5,5);
        System.out.println(res3);



    }
}
