import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("This is a simple calculator.");
        System.out.println("It supports +, -, *, and /.");
        Scanner sc = new Scanner(System.in);
        char repeat= 'y';
        while (repeat== 'y'){
            System.out.println("enter the first number:");
            double num1 = sc.nextDouble();
            System.out.println("enter your operator +,-,*,/");
            char operator = sc.next().charAt(0);
            System.out.println("enter second number:");
            double num2 = sc.nextDouble();
            double result;
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("cannot divide by zero");
                    return;
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("invalid operator");
                return;
            }
            System.out.println("your result is " + num1 + " " + operator + " " + num2 + " = " + result);
            System.out.println("do you want to perform another calculation (y/n)");
            repeat = sc.next().charAt(0);
        }
        System.out.println("exit");
    }
}