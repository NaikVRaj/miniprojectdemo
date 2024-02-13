// package com.example.spe_task;

// import java.lang.Math;
// import java.io.*;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// @RestController
// public class calculator {
//     @GetMapping
//     public static void main(String[] args) throws IOException, InterruptedException {
//         String c, n, x;
//         double a, b, add, div, sub, mul, fct=1;
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         while (true) {
//             System.out.println("\n         Scientific Calculator \n Enter your choice to perform an action:  \n" );
//             System.out.println("Enter 1 for Addition(+) \n 2 for Subtraction(-) \n 3 for Multiplication(x) \n 4 for Division(÷) \n 5 for Sin \n 6 for Cos \n 7 for Tan\n 8 for Power(^)\n 9 for Pi(π) \n 10 for RootOver(√) \n 11 for Factorial(x!) \n 0 for Exit \n=> ");
//             x = br.readLine();
//             int s = Integer.parseInt(x);
//             switch (s) {
//                 case 1 -> {
//                     System.out.println("\n Enter 1st number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println(" Enter 2nd number: ");
//                     n = br.readLine();
//                     b = Double.parseDouble(n);
//                     add = a + b;
//                     System.out.println("The addition of the numbers: " + a + "+" + b + " = " + add);
//                 }
//                 case 2 -> {
//                     System.out.println("\n Enter 1st number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println(" Enter 2nd number: ");
//                     n = br.readLine();
//                     b = Double.parseDouble(n);
//                     sub = a - b;
//                     System.out.println("The Subtraction of the numbers: " + a + "-" + b + " = " + sub);
//                 }
//                 case 3 -> {
//                     System.out.println("\n Enter 1st number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println(" Enter 2nd number: ");
//                     n = br.readLine();
//                     b = Double.parseDouble(n);
//                     mul = a * b;
//                     System.out.println("The Subtraction of the numbers: " + a + "x" + b + " = " + mul);
//                 }
//                 case 4 -> {
//                     System.out.println("\n Enter 1st number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println(" Enter 2nd number: ");
//                     n = br.readLine();
//                     b = Double.parseDouble(n);
//                     div = a / b;
//                     System.out.println("The Subtraction of the numbers: " + a + "÷" + b + " = " + div);
//                 }
//                 case 5 -> {
//                     System.out.println("\n Enter the number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println("Sin("+a+")= "+Math.sin(a));
//                 }
//                 case 6 -> {
//                     System.out.println("\n Enter the number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println("Cos("+a+")= "+Math.cos(a));

//                 }
//                 case 7 -> {
//                     System.out.println("\n Enter the number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println("Tan("+a+") = "+Math.tan(a));
//                 }
//                 case 8 -> {
//                     System.out.println("\n Enter the number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println("Enter ^ :");
//                     n = br.readLine();
//                     b=Double.parseDouble(n);
//                     System.out.println(a+"^"+b+"= "+Math.pow(a, b));
//                 }
//                 case 9 -> {
//                     System.out.println("\n Enter the number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     b= a*3.141592653589793238462643383279502884197;
//                     System.out.println(a+"π = "+b);
//                 }
//                 case 10 ->{
//                     System.out.println("\n Enter the number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     System.out.println(" √"+a+" = "+Math.pow(a, 0.5));
//                 }
//                 case 11 -> {
//                     System.out.println("\n Enter the number: ");
//                     c = br.readLine();
//                     a = Double.parseDouble(c);
//                     for(int i=1;i<=a;i++){
//                         fct=fct*i;
//                     }
//                     System.out.println(a+"! = "+fct);
//                 }
//                 case 0 -> {
//                         System.out.println("\n Exiting Program...");
//                         System.exit(0);
//                 }
//                 default -> System.out.println("Enter valid choice!");
//             }
//             Thread.sleep(2000);
//         }
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class calculator {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(Calculator.class, args);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("\033[H\033[2J"); // Clear the console
                System.out.println("\n*************************************");
                System.out.println("****** Welcome to Scientific *******");
                System.out.println("*********    Calculator    *********");
                System.out.println("*************************************\n");

                System.out.println("Choose an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (x)");
                System.out.println("4. Division (÷)");
                System.out.println("5. Sine (sin)");
                System.out.println("6. Cosine (cos)");
                System.out.println("7. Tangent (tan)");
                System.out.println("8. Power (^)");
                System.out.println("9. Pi (π)");
                System.out.println("10. Square Root (√)");
                System.out.println("11. Factorial (x!)");
                System.out.println("0. Exit");

                System.out.print("\nEnter your choice: ");
                String choice = br.readLine();

                switch (choice) {
                    case "1":
                        performAddition(br);
                        break;
                    case "2":
                        performSubtraction(br);
                        break;
                    case "3":
                        performMultiplication(br);
                        break;
                    case "4":
                        performDivision(br);
                        break;
                    case "5":
                        performSine(br);
                        break;
                    case "6":
                        performCosine(br);
                        break;
                    case "7":
                        performTangent(br);
                        break;
                    case "8":
                        performPower(br);
                        break;
                    case "9":
                        printPi();
                        break;
                    case "10":
                        performSquareRoot(br);
                        break;
                    case "11":
                        performFactorial(br);
                        break;
                    case "0":
                        System.out.println("\nExiting Program...");
                        return;
                    default:
                        System.out.println("\nInvalid choice! Please try again.");
                }
                Thread.sleep(2000);
            }
        }
    }

    private static void performAddition(BufferedReader br) throws IOException {
        System.out.print("\nEnter the first number: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter the second number: ");
        double b = Double.parseDouble(br.readLine());
        double result = a + b;
        System.out.println("Result: " + a + " + " + b + " = " + result);
    }

    private static void performSubtraction(BufferedReader br) throws IOException {
        System.out.print("\nEnter the first number: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter the second number: ");
        double b = Double.parseDouble(br.readLine());
        double result = a - b;
        System.out.println("Result: " + a + " - " + b + " = " + result);
    }

    private static void performMultiplication(BufferedReader br) throws IOException {
        System.out.print("\nEnter the first number: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter the second number: ");
        double b = Double.parseDouble(br.readLine());
        double result = a * b;
        System.out.println("Result: " + a + " * " + b + " = " + result);
    }

    private static void performDivision(BufferedReader br) throws IOException {
        System.out.print("\nEnter the first number: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter the second number: ");
        double b = Double.parseDouble(br.readLine());
        if (b == 0) {
            System.out.println("Error: Division by zero!");
        } else {
            double result = a / b;
            System.out.println("Result: " + a + " ÷ " + b + " = " + result);
        }
    }

    private static void performSine(BufferedReader br) throws IOException {
        System.out.print("\nEnter the number: ");
        double a = Double.parseDouble(br.readLine());
        double result = Math.sin(a);
        System.out.println("Result: sin(" + a + ") = " + result);
    }

    private static void performCosine(BufferedReader br) throws IOException {
        System.out.print("\nEnter the number: ");
        double a = Double.parseDouble(br.readLine());
        double result = Math.cos(a);
        System.out.println("Result: cos(" + a + ") = " + result);
    }

    private static void performTangent(BufferedReader br) throws IOException {
        System.out.print("\nEnter the number: ");
        double a = Double.parseDouble(br.readLine());
        double result = Math.tan(a);
        System.out.println("Result: tan(" + a + ") = " + result);
    }

    private static void performPower(BufferedReader br) throws IOException {
        System.out.print("\nEnter the base number: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter the exponent: ");
        double b = Double.parseDouble(br.readLine());
        double result = Math.pow(a, b);
        System.out.println("Result: " + a + "^" + b + " = " + result);
    }

    private static void printPi() {
        double pi = Math.PI;
        System.out.println("\nπ = " + pi);
    }

    private static void performSquareRoot(BufferedReader br) throws IOException {
        System.out.print("\nEnter the number: ");
        double a = Double.parseDouble(br.readLine());
        if (a < 0) {
            System.out.println("Error: Square root of a negative number is undefined!");
        } else {
            double result = Math.sqrt(a);
            System.out.println("Result: √" + a + " = " + result);
        }
    }

    private static void performFactorial(BufferedReader br) throws IOException {
        System.out.print("\nEnter the number: ");
        int n = Integer.parseInt(br.readLine());
        if (n < 0) {
            System.out.println("Error: Factorial of a negative number is undefined!");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Result: " + n + "! = " + factorial);
        }
    }
}
