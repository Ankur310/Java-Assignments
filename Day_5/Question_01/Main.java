package Question_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Id");
        int id = scn.nextInt();
        System.out.println("Enter Employee Name");
        String name = scn.next();
        System.out.println("Enter salary");
        Double salary = scn.nextDouble();
        System.out.println("Enter pf percentage");
        Double pf = scn.nextDouble();

        Employee EMP = new Employee(id,name,salary);
        EMP.CalaculateNetSalary(pf);

        System.out.println(EMP);
    }
}
