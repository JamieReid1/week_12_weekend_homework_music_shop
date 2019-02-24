package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int stockCount(){
        return stock.size();
    }

    public void add(ISell item){
        stock.add(item);
    }

    public ISell remove(ISell item){
        return stock.remove((stock.indexOf(item)));
    }

}
