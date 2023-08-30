package L5task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void shouldRetrieveEmployeeFullName() {
        //given
        Employee employee = new Employee("John", "Smith");
        //when
        String actualEmployeeFullName = employee.getEmployeeFullName();
        //then
        Assertions.assertNotNull(actualEmployeeFullName);
        Assertions.assertEquals("Employee name : John Smith", actualEmployeeFullName);
    }

    @Test
    void shouldRetrieveEmployeeNameAndAge() {
        //given
        Employee employee = new Employee("John", "Smith", 45);
        //when
        String actualEmployeeNameAndAge = employee.getEmployeeNameAndAge();
        //then
        Assertions.assertNotNull(actualEmployeeNameAndAge);
        Assertions.assertEquals("Employee details of Name and Age: John Smith is 45", actualEmployeeNameAndAge);
    }


    @Test
    void shouldRetrieveBaseSalary() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        Employee employee = new Employee("John", "Smith", 45, baseSalary);
        //when
        BigDecimal actualBaseSalary = employee.getBaseSalary();
        //then
        Assertions.assertNotNull(actualBaseSalary);
        Assertions.assertEquals(baseSalary, actualBaseSalary);
    }


    @Test
    void shouldRetrieveTotalSalary() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", 45, baseSalary, bonus, "Smith");
        //when
        BigDecimal actualTotalSalary = employee.getTotalSalary();
        //then
        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(baseSalary.add(bonus), actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", 45, baseSalary, bonus, "Smith");
        //when
        BigDecimal actualBonus = employee.getBonus();
        //then
        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }

}