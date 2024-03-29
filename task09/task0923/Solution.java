package Javarush.task09.task0923;

//package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        StringBuilder sb = new StringBuilder();
        String str;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            str = reader.readLine();
            char ch;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (isVowel(ch)) {
                    System.out.print(ch + " ");
                } else {
                    if (ch != ' ')
                        sb.append(ch + " ");
                }
            }
            System.out.println();
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}






























