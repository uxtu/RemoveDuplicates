package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class CheckDuplicates {

public  Collection<Product>  remove(Collection <Product> a){
    ArrayList<Product> out = new ArrayList<>();
    for(Product o: a){
        boolean cnt = false;
        for(int i = 0; i < out.size(); i++) { // проходим по коллекции в поисках совпадений
            if((out.get(i).getName().contains(o.getName())) & (out.get(i).getCost().equals(o.getCost()))){
                cnt = true; // есть совпадение
                break;
            }
        }
        if(!cnt) // нет совпадений, значит добавляем
            out.add(new Product(o.getName(), o.getCost()));
    }

    return out;
    }

    public void show(Collection<Product> out){
        for(Product i: out)
            System.out.println(i.getName() + " " + i.getCost());
    }
}
