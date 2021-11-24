package com.homework.daniel.shop;


import com.homework.daniel.shop.Model.Employee.Person;
import com.homework.daniel.shop.Model.Shop.CandyShop;
import com.homework.daniel.shop.Model.Shop.GameShop;
import com.homework.daniel.shop.Model.Shop.Shop;
import com.homework.daniel.shop.Model.Shop.ShopFactory;


public class Main {

    public static void main(String[] args) {
        CandyShop candyShop = new CandyShop(new Person("daniel", "owner"),
                new Person("dudu","cashier"),false);
        candyShop.purchaseItem("Twix",50);
        candyShop.purchaseItem("bamba",50);
        candyShop.purchaseItem("bamba",50);
        candyShop.purchaseItem("bamba",50);
        System.out.println(candyShop.cashInRegister);
        candyShop.payTaxes();

        GameShop gameShop = new GameShop(new Person("Daniel","owner"),
                new Person("yossi","cashier"),false);
        gameShop.purchaseItem("BF5",30);
        gameShop.purchaseItem("MW3",30);
        System.out.println(gameShop.cashInRegister);
        gameShop.payTaxes();

        Shop.whichIsMoreSuccessful(gameShop,candyShop);

        ShopFactory shopFactory = new ShopFactory();
        shopFactory.getShop("CANDY");
        System.out.println();
        shopFactory.getShop("GAME");

    }
}