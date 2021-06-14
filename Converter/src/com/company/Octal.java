package com.company;

public class Octal extends Number {
    // declare variables
    public int[] OctalNumberConversion = new int [40];

    public Octal(int number) {
        super(number);
        this.Number = number; // assigns the value of the parameter a to the field of the same name

        while(Number > 0 && Number != 0){ // runs when the condition is met
            // the statements is for calculating the remainder
            OctalNumberConversion[index++] = Number%8;
            Number = Number/8;
        }
        // for loop adds the remainder to the array in a reverse order
        // the i is the remainder
        for(int i = index-1;i >= 0;i--){
            System.out.print(OctalNumberConversion[i]);
        }
    }

    @Override
    public String toString(){
        return String.format(" is the octal number\n\n");
    }
}
