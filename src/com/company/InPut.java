package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InPut {

    public String[] inPut() throws IOException {
        Arabic arab = new Arabic();
        Rome rom = new Rome();
        Arithm arithm = new Arithm();
        OutPut outPut = new OutPut();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два арабских или римских числа в диапазоне [1-10] и знак арифметического действия между ними через пробел");
        String string = reader.readLine();
        Pattern arabic = Pattern.compile("[0123456789]{1,2}\\s[\\+|\\-|\\*|\\/]\\s[0123456789]{1,2}");
        Matcher matcherA = arabic.matcher(string);
        Pattern rome = Pattern.compile("[IVX]{1,4}\\s[\\+|\\-|\\*|\\/]\\s[IVX]{1,4}");
        Matcher matcherR = rome.matcher(string);
        Pattern p = Pattern.compile("\\s");
        String[] strings = new String[3];
        if (matcherA.matches()) {
            strings = p.split(string);
            outPut.printArab(arithm.arithm(arab.arabic(strings), strings));
        } else if (matcherR.matches()) {
            strings = p.split(string);
            outPut.printRoman(arithm.arithm(rom.rome(strings), strings));
        } else {
            System.out.println("ошибка");
        }
        return strings;
    }
}
