import java.util.*;

public class PayMoneyTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of transaction array: ");
        int n = scanner.nextInt(); // number of transactions
        long[] transactions = new long[n];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < n; i++) {
            transactions[i] = scanner.nextLong(); // read transaction amount
        }
        System.out.println("Enter the total no of targets that needs to be achieved: ");
        int t = scanner.nextInt(); // number of targets
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the value of target: ");
            long target = scanner.nextLong(); // daily target
            long sum = 0; // running total
            int transaction = -1; // transaction at which target is achieved
            for (int j = 0; j < n; j++) {
                sum += transactions[j];
                if (sum >= target && transaction == -1) {
                    transaction = j + 1;
                }
            }
            if (transaction == -1) {
                System.out.println("Target is not achieved");
            } else {
                System.out.println("Target achieved after " + transaction + " transactions");
            }
        }
        scanner.close();
    }
}
