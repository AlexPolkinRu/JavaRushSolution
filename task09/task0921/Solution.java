package Javarush.task09.task0921;

//package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while(true) {
                String str = reader.readLine();
                number = Integer.parseInt(str);
                numbers.add(number);
            }
        }
        catch (Exception e){
            for (int num : numbers){
                System.out.println(num);
            }
        }

    }
}






























