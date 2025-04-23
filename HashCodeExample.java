import java.util.*;

public class HashCodeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any text: ");
        String input = sc.nextLine();

        int hash = input.hashCode();

        System.out.println("HashCode: " + hash);
    }
}
