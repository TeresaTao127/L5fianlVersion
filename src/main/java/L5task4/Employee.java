package L5task4;

import java.math.BigDecimal;

public class Employee {

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.surname = surname;
    }

    public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surname = surname;
    }

    private final String name;
    private final String surname;
    private int age;

    public String getEmployeeFullName() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeNameAndAge() {
        return "Employee details of Name and Age: " + name + WHITE_SPACE + surname + " is " + age;
    }

    public static final String WHITE_SPACE = " ";

    // Method is used to get total  salary
    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    private BigDecimal baseSalary;
    private BigDecimal bonus;
}

