import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array (including the missing number): ");
        int n = s.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers between 1 and " + n + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        boolean found;
        for (int i = 1; i <= n; i++) {
            found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing number is: " + i);
                break;
            }
        }

    }
}
