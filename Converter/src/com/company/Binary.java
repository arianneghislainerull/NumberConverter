package com.company;

public class Binary extends Number{
    // declare variable
    public int[] BinaryNumberConversion = new int [40];

    public Binary(int number) {
        super(number);
        this.Number = number; // assigns the value of the parameter a to the field of the same name

        while(Number > 0 && Number != 0){ // runs when the condition is met
            // the statements is for calculating the remainder
            BinaryNumberConversion[index++] = Number%2;
            Number = Number/2;
        }
        // for loop adds the remainder to the array in a reverse order
        // the i is the remainder
        for(int i = index-1;i >= 0;i--){
            System.out.print(BinaryNumberConversion[i]);
        }
    }

    @Override
    public String toString(){
        return String.format(" is the binary number\n\n");
    }
}
