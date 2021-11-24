package com.homework.daniel.shop.Model.Shop.Products;

import java.util.Arrays;

public class Candy {
    public Candy() {
    }

    public String[] candies = {"bamba","Lolipop","Twix","Kitkat","Pringles"};
    public int[] price = {15,22,10,15,18};


    public String toString() {
        return "Candy{" +
                "candies=" + Arrays.toString(candies) +
                ", price=" + Arrays.toString(price) +
                '}';
}
}
