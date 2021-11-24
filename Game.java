package com.homework.daniel.shop.Model.Shop.Products;

import java.util.Arrays;

public class Game {

    public String[] game = {"CS:GO","BF5","MW3","Dota2","GTA-V"};
    public int[] price = {20,20,25,12,15};

    @Override
    public String toString() {
        return "Game{" +
                "game=" + Arrays.toString(game) +
                ", price=" + Arrays.toString(price) +
                '}';
    }
}
