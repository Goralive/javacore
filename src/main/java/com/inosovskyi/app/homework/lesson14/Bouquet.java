package com.inosovskyi.app.homework.lesson14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bouquet {
    private int price;
    private Flower flowers[];

    public Bouquet(int count) {
        this.flowers = new Flower[count];
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "price=" + price +
                ", flowers=" + Arrays.toString(flowers) +
                '}';
    }

    public void addSomeFlowers (Flower [] flowerType ){
        for (int i = 0; i <flowers.length ; i++) {
           int j = (int) (Math.random() * flowerType.length);
            flowers[i]= flowerType[j];
            price += flowers[i].getPrice();
        }

    }
}
