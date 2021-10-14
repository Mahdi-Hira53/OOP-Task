package hira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        MyCalculator myCalculator = new MyCalculator();

        System.out.println("Som of divisor: "+myCalculator.divisorSum(n));

        System.out.println("Factorial: "+myCalculator.findFactorial(n));

    }
}

/**
 * Name: Md. Mahdi Hossain Hira
 * ID: 2012020106
 * Section: C
 * Email: cse_2012020106@lus.ac.bd
 * Date: 15/10/2021
 */