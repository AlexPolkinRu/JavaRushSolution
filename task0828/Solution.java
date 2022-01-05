package Javarush.task0828;

//package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> months = new ArrayList();
        months.add(0, "January");
        months.add(1, "February");
        months.add(2, "March");
        months.add(3, "April");
        months.add(4, "May");
        months.add(5, "June");
        months.add(6, "July");
        months.add(7, "August");
        months.add(8, "September");
        months.add(9,"October");
        months.add(10, "November");
        months.add(11, "December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputUser = reader.readLine();

        if (months.contains(inputUser))
            System.out.println(inputUser + " is the " + (months.indexOf(inputUser) + 1) + " month");
        else
            System.out.println(inputUser + " is not month");
    }
}






























