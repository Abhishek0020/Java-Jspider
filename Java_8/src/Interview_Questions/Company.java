package Interview_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    public static void main(String[] args) {
        Emp e1 = new Emp("abhi", 25, 100);
        Emp e2 = new Emp("radha", 20, 101);
        Emp e3 = new Emp("suhani", 24, 100);
        Emp e4 = new Emp("sakshi", 23, 90);
        Emp e5 = new Emp("raj", 20, 95);

        List<Emp> empList = Arrays.asList(e1, e2, e3, e4, e5);

        // Sort employees by age using Stream API
        
        List<Emp> sortedByAge = empList.stream()
        		.sorted(Comparator.comparingInt(emp -> emp.age))
                .collect(Collectors.toList());

        
        // Print sorted list
        System.out.println("Employees sorted by age:");
        sortedByAge.forEach(System.out::println);
    }
}
