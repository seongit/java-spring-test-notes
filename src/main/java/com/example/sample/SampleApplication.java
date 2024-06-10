package com.example.sample;

import java.util.Scanner;

public class SampleApplication {
    public static void main(String[] args) {
        System.out.println("Enter two numbers and an operator (e.g. 1 + 2:) ");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        String[] parts = result.split(" ");
        long number1 = Long.parseLong(parts[0]);
        long number2 = Long.parseLong(parts[2]);
        String operator = parts[1];
        long answer = new Calculator().calculate(number1, operator, number2);

        System.out.println("answer = " + answer);
    }
}
