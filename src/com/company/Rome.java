package com.company;

import java.util.Scanner;

public class Rome {

    public int[] rome(String[] strings){
        int[] ints = new int[2];
        int j = 0;
        for(int i = 0; i < strings.length; i++){
            switch (strings[i]) {
                case "I": ints[j] = 1; j++; break;
                case "II": ints[j] = 2; j++; break;
                case "III": ints[j] = 3; j++; break;
                case "IV": ints[j] = 4; j++; break;
                case "V": ints[j] = 5; j++; break;
                case "VI": ints[j] = 6; j++; break;
                case "VII": ints[j] = 7; j++; break;
                case "VIII": ints[j] = 8; j++; break;
                case "IX": ints[j] = 9; j++; break;
                case "X": ints[j] = 10; j++; break;
                default: continue;
            }
        }
        return ints;
    }
}
