package Supplier;

import java.util.function.Predicate;

public class Empdriver {
    public static void main(String[] args) {
        Emp e1 = new Emp("Dhoni", 43, 100000);
        Emp e2 = new Emp("Rahul", 29, 10000);
        Emp e3 = new Emp("Narayne", 35, 5000);
        Emp e4 = new Emp("Varun", 34, 6000);

        Emp[] employees = {e1, e2, e3, e4};

        Predicate<Emp> salaryLessThan10k = emp -> emp.salary < 10000;

        System.out.println("Employees with salary less than 10,000:");
        for (Emp em : employees) { 
        	
            if (salaryLessThan10k.test(em)) {
                System.out.println(em);
            }
        }
    }
}
