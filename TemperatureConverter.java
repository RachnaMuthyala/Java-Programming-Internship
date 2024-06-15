import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;
        int choice;

        do {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    celsius = input.nextDouble();
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.\n", celsius, fahrenheit);
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    celsius = input.nextDouble();
                    kelvin = celsius + 273.15;
                    System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Kelvin.\n", celsius, kelvin);
                    break;
                case 3:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.\n", fahrenheit, celsius);
                    break;
                case 4:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                    System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Kelvin.\n", fahrenheit, kelvin);
                    break;
                case 5:
                    System.out.print("Enter temperature in Kelvin: ");
                    kelvin = input.nextDouble();
                    celsius = kelvin - 273.15;
                    System.out.printf("%.2f degrees Kelvin is equal to %.2f degrees Celsius.\n", kelvin, celsius);
                    break;
                case 6:
                    System.out.print("Enter temperature in Kelvin: ");
                    kelvin = input.nextDouble();
                    fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
                    System.out.printf("%.2f degrees Kelvin is equal to %.2f degrees Fahrenheit.\n", kelvin, fahrenheit);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        input.close();
    }
}
