import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / 5;

        // Display results
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}
