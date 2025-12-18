package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int a[] = {6, 5, 7, 8, 8, 6, 1, 1, 0, 0};
        
        // Step 1: Create an ArrayList to store the elements of the array
        List<Integer> l = new ArrayList<Integer>();
        for (int n : a) {
            l.add(n);
        }
        
        // Step 2: Sort the list in ascending order
        Collections.sort(l);
        
        // Step 3: Use a LinkedHashSet to remove duplicates and maintain order
        Set<Integer> s = new LinkedHashSet<Integer>();
        for (int n : l) {
            s.add(n);
        }
        
        // Step 4: Print the list and the set
        System.out.println("List (with duplicates): " + l);
        System.out.println("Set (unique elements): " + s);
        
        // Step 5: Find the maximum and second maximum elements in the set
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        Iterator<Integer> i = s.iterator();
        
        // Step 6: Iterate through the set to find the max and second max
        while (i.hasNext()) {
            max2 = max1;
            max1 = i.next();
        }	
        
        // Step 7: Print the second maximum element
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element.");
        } else {
            System.out.println("Second Maximum: " + max2);
        }
    }
}
