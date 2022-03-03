package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        int mult = num1 * num2 *num3;
        double avrg = (num1 + num2 + num3)/3.0;
        System.out.println("\n" + num1 + " + " + num2 + " + " + num3 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + mult);
        System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ")" + " / " + "3 " + " = " + avrg);
    }
}
