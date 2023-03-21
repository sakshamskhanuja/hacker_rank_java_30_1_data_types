import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Pre-defined var.
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        try {
            // Reads an integer.
            int a = Integer.parseInt(scanner.nextLine());

            // Reads a double.
            double b = Double.parseDouble(scanner.nextLine());

            // Reads a String.
            String c = scanner.nextLine();

            // i + a
            System.out.println(i + a);

            // d + b
            System.out.println(d + b);

            // s + c
            System.out.println(s.concat(" ").concat(c));
        } catch (NumberFormatException e) {
            System.out.println("Cannot parse input.");
        } finally {
            // Closes the scanner.
            scanner.close();
        }
    }
}
