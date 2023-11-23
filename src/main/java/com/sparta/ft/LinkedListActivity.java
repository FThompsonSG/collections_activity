package com.sparta.ft;

import java.util.LinkedList;

public class LinkedListActivity {

    public static LinkedList<String> createLinkedList() {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("London");
        cities.add("Tokyo");
        cities.add("Washington");
        cities.add("Dublin");
        cities.add("Paris");

        for (String city : cities) {
            System.out.println(city);
        }

        return cities;

    }

}
