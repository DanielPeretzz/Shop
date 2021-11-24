package com.homework.daniel.shop.Model.Shop;

import com.homework.daniel.shop.Model.Employee.Person;

import java.util.Scanner;

public class ShopFactory {

    enum availableShopTypes {
        CANDY, GAME
    }
    Scanner SCANNER = new Scanner(System.in);

    public Shop getShop(String shopType){
        String shopName;
        String ownerName;
        String cashierName;
        Shop shop = null;

        if (shopType.equals(availableShopTypes.CANDY.toString())){
            System.out.println("Great! A new Candy shop is creating! Please enter the following properties: ");
            System.out.println("Shop name, Owner name & Cashier name: ");
            shop = new CandyShop(new Person( ownerName = SCANNER.next(),SCANNER.next()),
                    new Person(cashierName = SCANNER.next(),SCANNER.next()),false);
            System.out.println("The new Candy shop " + " ** " + " ** " + " has been created!");

        } else if(shopType.equals(availableShopTypes.GAME.toString())){
            System.out.println("Great! A new Game shop is creating! Please enter the following properties: ");
            System.out.println("Shop name, Owner name & Cashier name: ");
            shop = new GameShop(new Person( ownerName = SCANNER.next(),SCANNER.next()),
                    new Person(cashierName = SCANNER.next(),SCANNER.next()),false);
            System.out.println("The new Game shop " + " ** " +  " ** " + " has been created!");
        } else{
            System.out.println("We couldn't found the desired shop!");
        }
        return shop;
    }



    public void purchaseItem(String name, float amountOfMoney) {

    }


    public void payTaxes() {

    }
}
