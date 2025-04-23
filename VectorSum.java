import java.util.Vector;

public class VectorSum {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        int sum = 0;
        System.out.println("Numbers in the vector:");

        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nSum of numbers: " + sum);
    }
}
