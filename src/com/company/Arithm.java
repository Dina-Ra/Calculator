package com.company;

public class Arithm {

    private int result;
    public int arithm(int[] ints, String[] strings){
        if (ints[0] < 1 || ints[1] < 1 || ints[0] > 10 || ints[1] > 10){
            System.out.println("Введеные числа не соответствуют указанному диапазону");
        } else {
            switch (strings[1]) {
                case "+":
                    setResult(ints[0] + ints[1]);
                    break;
                case "-":
                    setResult(ints[0] - ints[1]);
                    break;
                case "*":
                    setResult(ints[0] * ints[1]);
                    break;
                case "/":
                    setResult(ints[0] / ints[1]);
                    break;
            }
        }
        return getResult();
    }

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
}
