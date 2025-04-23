import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector to store Integer objects
        Vector<Integer> vector = new Vector<>();
        
        // Adding some integer values to the vector
        vector.add(10);
        vector.add(30);
        vector.add(50);
        vector.add(20);
        vector.add(40);

        // Sorting the vector
        Collections.sort(vector);

        // Display the sorted vector
        System.out.println("Sorted Vector: " + vector);

        // Display the largest number (last element after sorting)
        System.out.println("Largest Number: " + vector.lastElement());

        // Display the smallest number (first element after sorting)
        System.out.println("Smallest Number: " + vector.firstElement());
    }
}
