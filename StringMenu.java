import java.util.ArrayList;
import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        words.add("apple");
         words.add("banana"); 
         words.add("cherry");
          words.add("watermelon");

        while (true) {
            System.out.println("\n1. Display all | 2. Largest string | 3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                words.forEach(System.out::println);
            } else if (choice == 2) {
                String largest = words.stream().max((s1, s2) -> s1.length() - s2.length()).orElse("");
                System.out.println("Largest string: " + largest);
            } else if (choice == 3) break;
            else System.out.println("Invalid choice!");
        }
    }
}
