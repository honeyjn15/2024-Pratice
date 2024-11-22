package net.javaguide.NormalJavaCodingProgram;

import java.util.Scanner;

public class ValidateLeapYear {
    public static void main(String[] args) {

        //2000 , 2024 ,2025 , 2000 ,2400 ,2100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println("isLearYear" + year);
        } else {
            System.out.println("isNotLearYear" + year);
        }
    }


    public static boolean isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
