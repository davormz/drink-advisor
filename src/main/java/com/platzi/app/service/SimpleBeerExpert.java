package com.platzi.app.service;

import java.util.ArrayList;
import java.util.List;

public class SimpleBeerExpert implements BeerSelectorService {

    @Override
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Gary Pale Ale");
            brands.add("Gout stout");
        }
        return brands;
    }
    
}
