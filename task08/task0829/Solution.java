package Javarush.task08.task0829;

//package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
                Москва
                Ивановы
                Киев
                Петровы
                Лондон
                Абрамовичи

                Лондон
         */

        Map<String, String> list = new HashMap<String, String>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.put(city, family);
        }

        String userInput = reader.readLine();

        if (!userInput.isEmpty()) {
            String city = list.get(userInput);
            System.out.println(city);
        }
    }
}






























