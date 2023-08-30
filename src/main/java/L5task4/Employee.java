package L5task4;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final String surname;
    private int age;

    private BigDecimal baseSalary;
    private BigDecimal bonus;
    public static final String WHITE_SPACE = " ";

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;

    }

    public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surname = surname;
    }


    public String getEmployeeFullName() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeNameAndAge() {
        return "Employee details of Name and Age: " + name + WHITE_SPACE + surname + " is " + age;
    }


    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }


}

