package com.sparta.ft;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetActivity {

    public static HashSet<String> createHashSet() {

        HashSet<String> techBrands = new HashSet<>();

        techBrands.add("Sony");
        techBrands.add("LG");
        techBrands.add("Apple");
        techBrands.add("Dell");
        techBrands.add("Dyson");
        techBrands.add("Facebook");
        techBrands.add("Microsoft");

//        return techBrands.size();
        return techBrands;

    }

    public static TreeSet<String> convertToTreeSet(HashSet<String> hashSet) {

        return new TreeSet<>(hashSet);

    }

}
