package TCS_IPA_Practice;

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double baseSalary;
    public Employee(int empId, String empName, double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
    }
    public double calculateBonus(){
        return (10 * this.baseSalary) / 100.0;
    }
}
class Manager extends Employee {
    private int teamSize;
    public double calculateBonus() {
        return (10 * baseSalary) / 100. + 500 * teamSize;
    }
}
public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
