import java.util.Scanner;

public class IT22340214Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter positive number: ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error Message: Enter only positive numbers!");
            } else {
                arr[count] = num;
                count++;
            }
        }

        // find maximum
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}