import java.util.*;

public class CurrencyDenomination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency denominations (in random order): ");
        String[] input = scanner.nextLine().split(" ");
        int[] denominations = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            denominations[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Enter the amount that you want to pay: ");
        int amount = scanner.nextInt();
        Arrays.sort(denominations);
        int notes = 0;
        for (int i = denominations.length - 1; i >= 0; i--) {
            if (amount >= denominations[i]) {
                int count = amount / denominations[i];
                notes += count;
                amount -= count * denominations[i];
            }
        }
        System.out.println("Minimum no of notes required: " + notes);
        scanner.close();
    }
}
