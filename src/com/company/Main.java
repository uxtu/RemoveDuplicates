package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> a = new ArrayList<>();
        String[] s = new String[]{"milk", "oil","coffee", "oil","tea"};
        Number[] n = new Number[]{10, 13.5, 2.99, 13.5, 2};
        for(int i = 0; i < s.length; i++)
            a.add(new Product(s[i],n[i]));

        CheckDuplicates c = new CheckDuplicates();
        c.show(c.remove(a));
    }
}
