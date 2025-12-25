import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        // Input conversion choice
        System.out.print("Convert to (C/F): ");
        char choice = scanner.next().charAt(0);

        // Display result
        if (choice == 'C' || choice == 'c')
            System.out.println("Celsius = " + toCelsius(temp));
        else
            System.out.println("Fahrenheit = " + toFahrenheit(temp));

        scanner.close();
    }
}
