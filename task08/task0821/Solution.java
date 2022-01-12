package Javarush.task08.task0821;
//package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();

        people.put("Рогозин", "Роман");
        people.put("Конышев", "Роман");
        people.put("Полочкин", "Александр");
        people.put("Шишкин", "Александр");
        people.put("Шашкин", "Денис");

        people.put("Шеревеня", "Сергей");
        people.put("Силкин", "Олег");
        people.put("Амиров", "Олег");
        people.put("Рогозин", "Игорь");
        people.put("Рогозин", "Даниил");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}






























