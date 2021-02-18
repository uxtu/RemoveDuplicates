package com.company;

public class Product<T extends Number> {
    private String name;
    private T cost;

    Product(String name, T cost){
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }

    public T getCost(){
        return cost;
    }

}
