/*1/public class Employee extends Person {

       int salary;

       public int getSalary() {
           return salary;
        }
        public void setSalary(int salary) {
           this.salary = salary;
        }
        boolean isSameName(Employee employee) {
           return name.equals(employee.name);
        }
    }
*/

/*public class Employee extends Person {

    int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    boolean isSameName(Employee employee) {
        return name.equals(employee.name);
    }
}*/

///////- инкапсуляция (ООП)
/*package com.com.test;

public class Employee extends Person {

    int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    boolean isSameName(Employee employee) {
        return this.getBaseName().equals(employee.getBaseName());
    }
}*/

///////////// POLYMORPHYZM ///////
/*package test1;

import com.test.Person;

public class Employee extends Person {

    int salary;

    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    boolean isSameName(Employee employee) {
        return this.getBaseName().equals(employee.getBaseName());
    }
}*/
//////////// 11/12/2020 ////////
//1
/*package base.test;
import com.test.Person;

public class Employee extends Person {

    int salary;

    public Employee(String name, int age, char sex, int salary){
        super(name, age, sex);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    boolean isSameName(Employee employee) {
        return this.getBaseName().equals(employee.getBaseName());
    }
    public String getName() {
        return getBaseName();
    }
    public String getPersonName() {
        return super.getName();
    }
}*/

/////////////////11/19/2020 //////
//1
/*package base.test;
import static utils.com.MonthUtils.Month;
public class Employee {

        private String name;
        private int salary;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }

 public int getSalary(Month[] monthArray) {
     int result = 0;
     for (int i = 0; i < monthArray.length; i++) {
         result += getSalary() * monthArray[i].getWorkDays();
     }
     return result;
 }
    }*/

///////8:13 worker, abstract
/*package base.test;
public abstract class Employee {

    private String name;
    private int baseSalary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public abstract int getSalary() {
    }
}*/