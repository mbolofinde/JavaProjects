import java.util.Scanner;

public class calc01 {
    public static void main (String[] args) {
        System.out.println("------------------------- \n" +
        "Welcome to the Basic Calculator \n " + "------------------ \n"  );

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation required (+, -, *, /) \n ");
        char operation = scanner.next().charAt(0);

        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Invalid operations");
        }

        if (operation == '/' && num2 == 0.0) {
            System.err.println("Dividion by Zero not allowed");
        }

        double result = 0;
        if (operation == '+') {
            result = num1 + num2; 
        } else if (operation == '-') { 
            result = num1 - num2; 

        } else if (operation == '*') {
            result = num1 * num2; 
        } else if (operation == '/') {
            result = num1 / num2; 
        } else {
            System.err.println("No valid Operations");
        }

        System.out.println(result);

    }
}