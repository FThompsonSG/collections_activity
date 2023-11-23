package com.sparta.ft;

import java.util.ArrayList;

public class ArrayListActivity {

    public static ArrayList<String> createArrayList() {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Yellow");
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");

        for (String colour : colours) {
            System.out.println(colour);
        }

        return colours;
    }

}
