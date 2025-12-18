package Function;

import java.util.function.Function;
import java.util.function.Predicate;

public class Empdriver {
    public static void main(String[] args) {
        Emp e1 = new Emp("Dhoni", 43, 100000);
        Emp e2 = new Emp("Rahul", 29, 10000);
        Emp e3 = new Emp("Narayne", 35, 5000);
        Emp e4 = new Emp("Varun", 34, 6000);

        Emp[] employees = {e1, e2, e3, e4};

        // Filter employees with salary less than 10000
        Predicate<Integer> p =  i-> i< 2000;
        Function<Emp, Integer>fn=i->{
        	int bonus;
        	if(i.salary<10000) {
        		bonus=(int)(i.salary*30)/100;
        		return bonus;
        	}
        	else if(i.salary>=10000 && i.salary<100000) {
        		bonus=(int)(i.salary*10)/100;
        		return bonus;
        	}
        	else {
				bonus=(int)(i.salary*5)/100;
				return bonus;
			}
        };

        for (Emp em : employees) {
        	int b=fn.apply(em);
            if (p.test(b)) {
                System.out.println(em);
                System.out.println("bonus : "+b);
            }
        }
    }
}
