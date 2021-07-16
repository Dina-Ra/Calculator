package com.company;

public class OutPut {

    public void printArab(int integer){
        System.out.println(integer);
    }

    public void printRoman(int integer){
        String resultRoman = "";
        switch (Math.abs(integer) / 100){
            case 0: resultRoman = resultRoman + "";
                break;
            case 1: resultRoman = resultRoman + "C";
                break;
        }
        switch (Math.abs(integer) / 10 % 10){
            case 0: resultRoman = resultRoman + ""; break;
            case 1: resultRoman = resultRoman + "X"; break;
            case 2: resultRoman = resultRoman + "XX"; break;
            case 3: resultRoman = resultRoman + "XXX"; break;
            case 4: resultRoman = resultRoman + "XL"; break;
            case 5: resultRoman = resultRoman + "L"; break;
            case 6: resultRoman = resultRoman + "LX"; break;
            case 7: resultRoman = resultRoman + "LXX"; break;
            case 8: resultRoman = resultRoman + "LXXX"; break;
            case 9: resultRoman = resultRoman + "XC"; break;
        }
        switch (Math.abs(integer) % 10){
            case 0: resultRoman = resultRoman + ""; break;
            case 1: resultRoman = resultRoman + "I"; break;
            case 2: resultRoman = resultRoman + "II"; break;
            case 3: resultRoman = resultRoman + "III"; break;
            case 4: resultRoman = resultRoman + "IV"; break;
            case 5: resultRoman = resultRoman + "V"; break;
            case 6: resultRoman = resultRoman + "VI"; break;
            case 7: resultRoman = resultRoman + "VII"; break;
            case 8: resultRoman = resultRoman + "VIII"; break;
            case 9: resultRoman = resultRoman + "IX"; break;
        }
        if (integer < 0){
            System.out.println("-" + resultRoman);
        } else {
            System.out.println(resultRoman);
        }
    }
}
