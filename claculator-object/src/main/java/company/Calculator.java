package company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("please enter a number");

        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();

        char operator = sc.next().charAt(0);

        double number2 = sc.nextDouble();
        double result = 0.0;

        switch(operator) {
            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
