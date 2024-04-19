package com.aut;

public class AUTMath {

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        // what if division by 0 happens?
        return num1 / num2;
    }

    public static int factorial(int number){
        // what if number <= 0?
        int result = 1;
        while(number > 0){
            result *= number;
            number -= 1;
        }
        return result;
    }

    public static int pow(int base, int power){
        int result = 1;
        while(power > 0){
            result *= base;
            power -= 1;
        }
        return result;
    }
}
