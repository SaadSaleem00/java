public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34}; // sample array
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max)
                max = num;
        }

        System.out.println("Maximum number: " + max);
    }
}
