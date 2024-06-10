package com.example.sample;

import java.util.Scanner;

public class SampleApplication {
    public static void main(String[] args) {
        CalculationRequest parts = new CalculationRequestReader().read();
        long answer = new Calculator().calculate(parts.getNum1(), parts.getOperator(), parts.getNum2());

        System.out.println("answer = " + answer);
    }
}
