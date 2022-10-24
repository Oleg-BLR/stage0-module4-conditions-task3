package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void main(String[] args) {
        calculateSalary(10);
    }
    public static void calculateSalary(int salary) {
        float taxes;
        float salaryAfterTaxes;
        if (salary >= 0 && salary <= 10000) {
            taxes = 15;
            System.out.println(salaryAfterTaxes = salary*(100 - taxes)/100);
        } else if (salary > 10000 && salary <= 20000) {
            taxes = 18;
            System.out.println(salaryAfterTaxes = salary*(100 - taxes)/100);
        } else if (salary > 20000) {
            taxes = 20;
            System.out.println(salaryAfterTaxes = salary*(100 - taxes)/100);
        } else if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
