package com.example.spe_task;

import java.lang.Math;
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
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//@RestController
//public class calculator {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        SpringApplication.run(calculator.class, args);
//
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            while (true) {
//                System.out.println("\033[H\033[2J"); // Clear the console
//                System.out.println("\n*************************************");
//                System.out.println("****** Welcome to Scientific *******");
//                System.out.println("*********    Calculator    *********");
//                System.out.println("*************************************\n");
//
//                System.out.println("Choose an operation:");
//                System.out.println("1. Addition (+)");
//                System.out.println("2. Subtraction (-)");
//                System.out.println("3. Multiplication (x)");
//                System.out.println("4. Division (÷)");
//                System.out.println("5. Sine (sin)");
//                System.out.println("6. Cosine (cos)");
//                System.out.println("7. Tangent (tan)");
//                System.out.println("8. Power (^)");
//                System.out.println("9. Pi (π)");
//                System.out.println("10. Square Root (√)");
//                System.out.println("11. Factorial (x!)");
//                System.out.println("0. Exit");
//
//                System.out.print("\nEnter your choice: ");
//                String choice = br.readLine();
//
//                switch (choice) {
//                    case "1":
//                        performAddition(br);
//                        break;
//                    case "2":
//                        performSubtraction(br);
//                        break;
//                    case "3":
//                        performMultiplication(br);
//                        break;
//                    case "4":
//                        performDivision(br);
//                        break;
//                    case "5":
//                        performSine(br);
//                        break;
//                    case "6":
//                        performCosine(br);
//                        break;
//                    case "7":
//                        performTangent(br);
//                        break;
//                    case "8":
//                        performPower(br);
//                        break;
//                    case "9":
//                        printPi();
//                        break;
//                    case "10":
//                        performSquareRoot(br);
//                        break;
//                    case "11":
//                        performFactorial(br);
//                        break;
//                    case "0":
//                        System.out.println("\nExiting Program...");
//                        System.exit(0);
//                        return;
//                    default:
//                        System.out.println("\nInvalid choice! Please try again.");
//                }
//                Thread.sleep(2000);
//            }
//        }
//    }
//
//    public static void performAddition(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the first number: ");
//        double a = Double.parseDouble(br.readLine());
//        System.out.print("Enter the second number: ");
//        double b = Double.parseDouble(br.readLine());
//        double result = a + b;
//        System.out.println("Result: " + a + " + " + b + " = " + result);
//    }
//
//    public static void performSubtraction(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the first number: ");
//        double a = Double.parseDouble(br.readLine());
//        System.out.print("Enter the second number: ");
//        double b = Double.parseDouble(br.readLine());
//        double result = a - b;
//        System.out.println("Result: " + a + " - " + b + " = " + result);
//    }
//
//    public static void performMultiplication(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the first number: ");
//        double a = Double.parseDouble(br.readLine());
//        System.out.print("Enter the second number: ");
//        double b = Double.parseDouble(br.readLine());
//        double result = a * b;
//        System.out.println("Result: " + a + " * " + b + " = " + result);
//    }
//
//    public static void performDivision(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the first number: ");
//        double a = Double.parseDouble(br.readLine());
//        System.out.print("Enter the second number: ");
//        double b = Double.parseDouble(br.readLine());
//        if (b == 0) {
//            System.out.println("Error: Division by zero!");
//        } else {
//            double result = a / b;
//            System.out.println("Result: " + a + " ÷ " + b + " = " + result);
//        }
//    }
//
//    public static void performSine(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the number: ");
//        double a = Double.parseDouble(br.readLine());
//        double result = Math.sin(a);
//        System.out.println("Result: sin(" + a + ") = " + result);
//    }
//
//    public static void performCosine(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the number: ");
//        double a = Double.parseDouble(br.readLine());
//        double result = Math.cos(a);
//        System.out.println("Result: cos(" + a + ") = " + result);
//    }
//
//    public static void performTangent(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the number: ");
//        double a = Double.parseDouble(br.readLine());
//        double result = Math.tan(a);
//        System.out.println("Result: tan(" + a + ") = " + result);
//    }
//
//    public static void performPower(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the base number: ");
//        double a = Double.parseDouble(br.readLine());
//        System.out.print("Enter the exponent: ");
//        double b = Double.parseDouble(br.readLine());
//        double result = Math.pow(a, b);
//        System.out.println("Result: " + a + "^" + b + " = " + result);
//    }
//
//    public static void printPi() {
//        double pi = Math.PI;
//        System.out.println("\nπ = " + pi);
//    }
//
//    public static void performSquareRoot(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the number: ");
//        double a = Double.parseDouble(br.readLine());
//        if (a < 0) {
//            System.out.println("Error: Square root of a negative number is undefined!");
//        } else {
//            double result = Math.sqrt(a);
//            System.out.println("Result: √" + a + " = " + result);
//        }
//    }
//
//    public static void performFactorial(BufferedReader br) throws IOException {
//        System.out.print("\nEnter the number: ");
//        int n = Integer.parseInt(br.readLine());
//        if (n < 0) {
//            System.out.println("Error: Factorial of a negative number is undefined!");
//        } else {
//            long factorial = 1;
//            for (int i = 1; i <= n; i++) {
//                factorial *= i;
//            }
//            System.out.println("Result: " + n + "! = " + factorial);
//        }
//    }
//}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//@RestController
//public class calculator {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        SpringApplication.run(calculator.class, args);
//
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            while (true) {
//                System.out.println("\033[H\033[2J"); // Clear the console
//                System.out.println("\n*************************************");
//                System.out.println("****** Welcome to Scientific *******");
//                System.out.println("*********    Calculator    *********");
//                System.out.println("*************************************\n");
//
//                System.out.println("Choose an operation:");
//                System.out.println("1. Addition (+)");
//                System.out.println("2. Subtraction (-)");
//                System.out.println("3. Multiplication (x)");
//                System.out.println("4. Division (÷)");
//                System.out.println("5. Sine (sin)");
//                System.out.println("6. Cosine (cos)");
//                System.out.println("7. Tangent (tan)");
//                System.out.println("8. Power (^)");
//                System.out.println("9. Pi (π)");
//                System.out.println("10. Square Root (√)");
//                System.out.println("11. Factorial (x!)");
//                System.out.println("0. Exit");
//
//                System.out.print("\nEnter your choice: ");
//                String choice = br.readLine();
//
//                switch (choice) {
//                    case "1":
//                        System.out.print("\nEnter the first number: ");
//                        double addA = Double.parseDouble(br.readLine());
//                        System.out.print("Enter the second number: ");
//                        double addB = Double.parseDouble(br.readLine());
//                        double addResult = performAddition(addA, addB);
//                        System.out.println("Result: " + addResult);
//                        break;
//                    case "2":
//                        System.out.print("\nEnter the first number: ");
//                        double subA = Double.parseDouble(br.readLine());
//                        System.out.print("Enter the second number: ");
//                        double subB = Double.parseDouble(br.readLine());
//                        double subResult = performSubtraction(subA, subB);
//                        System.out.println("Result: " + subResult);
//                        break;
//                    case "3":
//                        System.out.print("\nEnter the first number: ");
//                        double mulA = Double.parseDouble(br.readLine());
//                        System.out.print("Enter the second number: ");
//                        double mulB = Double.parseDouble(br.readLine());
//                        double mulResult = performMultiplication(mulA, mulB);
//                        System.out.println("Result: " + mulResult);
//                        break;
//                    case "4":
//                        System.out.print("\nEnter the first number: ");
//                        double divA = Double.parseDouble(br.readLine());
//                        System.out.print("Enter the second number: ");
//                        double divB = Double.parseDouble(br.readLine());
//                        double divResult = performDivision(divA, divB);
//                        System.out.println("Result: " + divResult);
//                        break;
//                    case "5":
//                        System.out.print("\nEnter the number: ");
//                        double sineInput = Double.parseDouble(br.readLine());
//                        double sineResult = performSine(sineInput);
//                        System.out.println("Result: sin(" + sineInput + ") = " + sineResult);
//                        break;
//                    case "6":
//                        System.out.print("\nEnter the number: ");
//                        double cosineInput = Double.parseDouble(br.readLine());
//                        double cosineResult = performCosine(cosineInput);
//                        System.out.println("Result: cos(" + cosineInput + ") = " + cosineResult);
//                        break;
//                    case "7":
//                        System.out.print("\nEnter the number: ");
//                        double tangentInput = Double.parseDouble(br.readLine());
//                        double tangentResult = performTangent(tangentInput);
//                        System.out.println("Result: tan(" + tangentInput + ") = " + tangentResult);
//                        break;
//                    case "8":
//                        System.out.print("\nEnter the base number: ");
//                        double powerBase = Double.parseDouble(br.readLine());
//                        System.out.print("Enter the exponent: ");
//                        double powerExponent = Double.parseDouble(br.readLine());
//                        double powerResult = performPower(powerBase, powerExponent);
//                        System.out.println("Result: " + powerBase + "^" + powerExponent + " = " + powerResult);
//                        break;
//                    case "9":
//                        double pi = getPi();
//                        System.out.println("\nπ = " + pi);
//                        break;
//                    case "10":
//                        System.out.print("\nEnter the number: ");
//                        double sqrtInput = Double.parseDouble(br.readLine());
//                        double sqrtResult = performSquareRoot(sqrtInput);
//                        System.out.println("Result: √" + sqrtInput + " = " + sqrtResult);
//                        break;
//                    case "11":
//                        System.out.print("\nEnter the number: ");
//                        int factorialInput = Integer.parseInt(br.readLine());
//                        double factorialResult = performFactorial(factorialInput);
//                        System.out.println("Result: " + factorialInput + "! = " + factorialResult);
//                        break;
//                    case "0":
//                        System.out.println("\nExiting Program...");
//                        System.exit(0);
//                        return;
//                    default:
//                        System.out.println("\nInvalid choice! Please try again.");
//                }
//                Thread.sleep(2000);
//            }
//        }
//    }
//
//    public static double performAddition(double a, double b) {
//        return a + b;
//    }
//
//    public static double performSubtraction(double a, double b) {
//        return a - b;
//    }
//
//    public static double performMultiplication(double a, double b) {
//        return a * b;
//    }
//    public static double performDivision(double a, double b) {
//        if (b == 0) {
//            throw new ArithmeticException("Division by zero!");
//        }
//        return a / b;
//    }
//
//    public static double performSine(double a) {
//        return Math.sin(a);
//    }
//
//    public static double performCosine(double a) {
//        return Math.cos(a);
//    }
//
//    public static double performTangent(double a) {
//        return Math.tan(a);
//    }
//
//    public static double performPower(double a, double b) {
//        return Math.pow(a, b);
//    }
//
//    public static double getPi() {
//        return Math.PI;
//    }
//
//    public static double performSquareRoot(double a) {
//        if (a < 0) {
//            System.out.println("Error: Square root of a negative number is undefined!");
//            return Double.NaN;
//        } else {
//            return Math.sqrt(a);
//        }
//    }
//
//    public static double performFactorial(int n) {
//        if (n < 0) {
//            System.out.println("Error: Factorial of a negative number is undefined!");
//            return Double.NaN;
//        } else {
//            long factorial = 1;
//            for (int i = 1; i <= n; i++) {
//                factorial *= i;
//            }
//            return factorial;
//        }
//    }
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class calculator {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(calculator.class, args);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                clearConsole();
                System.out.println("\n**************************************");
                System.out.println("*         Welcome to Scientific       *");
                System.out.println("*            Calculator               *");
                System.out.println("**************************************\n");

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
                        performOperation("Addition", br);
                        break;
                    case "2":
                        performOperation("Subtraction", br);
                        break;
                    case "3":
                        performOperation("Multiplication", br);
                        break;
                    case "4":
                        performOperation("Division", br);
                        break;
                    case "5":
                        performSingleInputOperation("Sine", "sin", br);
                        break;
                    case "6":
                        performSingleInputOperation("Cosine", "cos", br);
                        break;
                    case "7":
                        performSingleInputOperation("Tangent", "tan", br);
                        break;
                    case "8":
                        performOperation("Power", br);
                        break;
                    case "9":
                        printPi();
                        break;
                    case "10":
                        performSingleInputOperation("Square Root", "√", br);
                        break;
                    case "11":
                        performFactorialOperation(br);
                        break;
                    case "0":
                        System.out.println("\nExiting Program...");
                        System.exit(0);
                        return;
                    default:
                        System.out.println("\nInvalid choice! Please try again.");
                }
                Thread.sleep(2000);
            }
        }
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void performOperation(String operation, BufferedReader br) throws IOException {
        System.out.print("\nEnter the first number: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter the second number: ");
        double b = Double.parseDouble(br.readLine());
        double result;
        switch (operation) {
            case "Addition":
                result = performAddition(a, b);
                break;
            case "Subtraction":
                result = performSubtraction(a, b);
                break;
            case "Multiplication":
                result = performMultiplication(a, b);
                break;
            case "Division":
                result = performDivision(a, b);
                break;
            case "Power":
                result = performPower(a, b);
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Result: " + result);
    }

    public static void performSingleInputOperation(String operation, String symbol, BufferedReader br) throws IOException {
        System.out.print("\nEnter the number: ");
        double input = Double.parseDouble(br.readLine());
        double result;
        switch (operation) {
            case "Sine":
                result = performSine(input);
                break;
            case "Cosine":
                result = performCosine(input);
                break;
            case "Tangent":
                result = performTangent(input);
                break;
            case "Square Root":
                result = performSquareRoot(input);
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Result: " + symbol + "(" + input + ") = " + result);
    }

    public static void performFactorialOperation(BufferedReader br) throws IOException {
        System.out.print("\nEnter the number: ");
        int input = Integer.parseInt(br.readLine());
        double result = performFactorial(input);
        System.out.println("Result: " + input + "! = " + result);
    }

    public static void printPi() {
        System.out.println("\nπ = " + Math.PI);
    }

    public static double performAddition(double a, double b) {
        return a + b;
    }

    public static double performSubtraction(double a, double b) {
        return a - b;
    }

    public static double performMultiplication(double a, double b) {
        return a * b;
    }

    public static double performDivision(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a / b;
    }

    public static double performSine(double a) {
        return Math.sin(a);
    }

    public static double performCosine(double a) {
        return Math.cos(a);
    }

    public static double performTangent(double a) {
        return Math.tan(a);
    }

    public static double performPower(double a, double b) {
        return Math.pow(a, b);
    }

    public static double performSquareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Square root of a negative number is undefined!");
            return Double.NaN;
        } else {
            return Math.sqrt(a);
        }
    }

    public static double performFactorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial of a negative number is undefined!");
            return Double.NaN;
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}

