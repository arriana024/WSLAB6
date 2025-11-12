import java.util.Scanner;
import java.nio.file.*;
import java.io.IOException;

public class number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        String greeting = "Hello, " + name + "! You are " + age + " years old.";

        System.out.println(greeting);

        try {
            Path filePath = Paths.get("greeting.txt");
            Files.writeString(filePath, greeting);
            System.out.println("Your greeting has been saved to greeting.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the greeting: " + e.getMessage());
        }

        input.close();
    }
}
