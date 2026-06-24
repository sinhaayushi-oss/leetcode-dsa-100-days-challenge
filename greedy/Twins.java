import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] coins = new int[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            totalSum += coins[i];
        }

        Arrays.sort(coins);

        int mySum = 0;
        int count = 0;

        // Take coins from largest to smallest
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            count++;

            if (mySum > totalSum - mySum) {
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}