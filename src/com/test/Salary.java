/*1/public class Salary {
    static int getSum(Employee[] employeeArray) {
        int Sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            Sum += employeeArray[i].getSalary();
        }
        return Sum;
    }
}*/


///10.(11/10)////////
/*package com.com.test;
public class Salary {
    static int getSum(Employee[] employeeArray) {
        int Sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            Sum += employeeArray[i].getSalary();
        }
        return Sum;
    }
}*/

///////////// POLYMORPHYZM ///////
/*package com.test;

import test1.Employee;

public class Salary {
    static int getSum(Employee[] employeeArray) {
        int Sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            Sum += employeeArray[i].getSalary();
        }
        return Sum;
    }
}*/

//////////////// 11/12/2020 /////////////
//1
/*package com.test;
import base.test.Worker;

public class Salary {

    public static int getSum(Worker[] workers) {
        int Sum = 0;
        for (int i = 0; i < workers.length; i++) {
            Sum += workers[i].getBaseSalary();
        }
        return Sum;
    }
}*/
