package com.azis.javafundamental;

public class SwitchWithoutBreak {

    public static void main(String[] args) {
        char input = 'C';
        int output = 1;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);
    }
}
