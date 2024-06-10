package com.example.sample;

import java.util.Scanner;

public class CalculationRequestReader {

    public CalculationRequest read(){
        System.out.println("Enter two numbers and an operator (e.g. 1 + 2:) ");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        String[] parts = result.split(" ");
        return new CalculationRequest(parts);
    }
}
