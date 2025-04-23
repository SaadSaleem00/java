public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 18};
        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
