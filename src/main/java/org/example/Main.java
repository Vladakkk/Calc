package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scanner.nextDouble();

        System.out.println("Enter operator ('+', '-', 'x', '/'): ");
        String operator = scanner.next();

        System.out.println("Enter second number: ");
        double secondNum = scanner.nextDouble();

        double result;
        switch (operator){
            case "+":
                result = firstNum + secondNum;
                break;
            case  "-":
                result = firstNum - secondNum;
                break;
            case "x":
                result = firstNum * secondNum;
                break;
            case "/":
                if (secondNum != 0){
                    result = firstNum / secondNum;
                }else{

                    System.out.println("Error: division by zero!!!");
                    return;
                }
                break;
            default:

                System.out.println("Error: invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
