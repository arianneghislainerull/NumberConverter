package com.company;

public class Hexadecimal extends Number {
    // declare variables
    public int[] HexadecimalNumberConversion = new int [40];

    public Hexadecimal(int number) {
        super(number);
        this.Number = number; // assigns the value of the parameter a to the field of the same name

        while(Number > 0 && Number != 0){ // runs when the condition is met
            // the statements is for calculating the remainder
            HexadecimalNumberConversion[index++] = Number%16;
            Number = Number/16;
        }
        // for loop adds the remainder to the array in a reverse order
        // the i is the remainder
        for(int i = index-1;i >= 0;i--){
            // the if and else if statements checks the value of i
            // and then the i gets translated to either a letter or number
            if ((HexadecimalNumberConversion[i])==15){
                System.out.print("F");
            } else if ((HexadecimalNumberConversion[i])==14){
                System.out.print("E");
            } else if ((HexadecimalNumberConversion[i])==13){
                System.out.print("D");
            } else if ((HexadecimalNumberConversion[i])==12){
                System.out.print("C");
            } else if ((HexadecimalNumberConversion[i])==11){
                System.out.print("B");
            } else if ((HexadecimalNumberConversion[i])==10){
                System.out.print("A");
            } else if ((HexadecimalNumberConversion[i])==9){
                System.out.print("9");
            } else if ((HexadecimalNumberConversion[i])==8){
                System.out.print("8");
            } else if ((HexadecimalNumberConversion[i])==7){
                System.out.print("7");
            } else if ((HexadecimalNumberConversion[i])==6){
                System.out.print("6");
            } else if ((HexadecimalNumberConversion[i])==5){
                System.out.print("5");
            } else if ((HexadecimalNumberConversion[i])==4){
                System.out.print("4");
            } else if ((HexadecimalNumberConversion[i])==3){
                System.out.print("3");
            } else if ((HexadecimalNumberConversion[i])==2){
                System.out.print("2");
            } else if ((HexadecimalNumberConversion[i])==1){
                System.out.print("1");
            }
        }
    }

    @Override
    public String toString(){
        return String.format(" is the hexadecimal number\n\n");
    }
}
