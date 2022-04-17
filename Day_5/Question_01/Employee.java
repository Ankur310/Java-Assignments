package Question_01;

public class Employee {
    int employeeId;
    String employeeName;
    Double salary;
    Double netSalary;

    public Employee(int employeeId, String employeeName, Double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;

    }

    public void CalaculateNetSalary(Double pf){
        Double netSalary = this.salary - (pf * 100.0);
        this.netSalary = netSalary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", netSalary=" + netSalary +
                '}';
    }
}
