package com.company;

// driver class
public class Main {

    public static void main(String[] args) {

        System.out.print("10 is the decimal number\n");
        Binary num0 = new Binary (10);
        System.out.print(num0);

        System.out.print("780 is the decimal number\n");
        Octal num1 = new Octal (780);
        System.out.print(num1);

        System.out.print("10387 is the decimal number\n");
        Hexadecimal num2 = new Hexadecimal(10387);
        System.out.print(num2);

        System.out.print("65535 is the decimal number\n");
        Hexadecimal num3 = new Hexadecimal(65535);
        System.out.print(num3);

        System.out.print("5111 is the decimal number\n");
        Hexadecimal num4 = new Hexadecimal(5111);
        System.out.print(num4);
    }
}
