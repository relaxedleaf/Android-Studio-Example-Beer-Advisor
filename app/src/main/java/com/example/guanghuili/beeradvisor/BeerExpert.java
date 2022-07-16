package com.example.guanghuili.beeradvisor;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();

        if (color.equals("Amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")) {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        } else if (color.equals("brown")) {
            brands.add("Newcastle");
            brands.add("Sam Adams");
        } else {
            brands.add("Guinness");
            brands.add("Red Stripe");
        }
        return brands;
    }
}