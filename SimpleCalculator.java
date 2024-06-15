import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double output;

        switch(operator) {
            case '+':
                output = number1 + number2;
                break;

            case '-':
                output = number1 - number2;
                break;

            case '*':
                output = number1 * number2;
                break;

            case '/':
                if (number2 != 0) {
                    output = number1 / number2;
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                    return;
                }
                break;

            default:
                System.out.println("Error! Invalid operator. Please enter any of these (+, -, *, /).");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f", number1, operator, number2, output);
    }
}
