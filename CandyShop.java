package com.homework.daniel.shop.Model.Shop;

import com.homework.daniel.shop.Model.Employee.Person;

import com.homework.daniel.shop.Model.Shop.Products.Candy;

import java.util.Objects;

public class CandyShop extends Shop {

    Candy candy = new Candy();
    public CandyShop(Person owner, Person cashier, boolean isClosed) {
        super(owner, cashier, isClosed);
    }
    @Override
    public void purchaseItem(String name, float amountOfMoney) {
        int index = 0;
        for (int i = 0; i < candy.candies.length ; i++) {
            if(Objects.equals(name, candy.candies[i])){
                index = i ;
            }
        }
        System.out.println("you purchase : "+candy.price[index]+ " in : "+ candy.price[index]);
        cashInRegister += candy.price[index];

    }
    private Candy candies;

    public Candy getCandy() {
        return candy;
    }

    public Candy getCandies() {
        return candies;
    }

    @Override
    public String toString() {
        return "CandyShop{" +
                "candy=" + candy +
                ", candies=" + candies +
                ", cashInRegister=" + cashInRegister +
                "} " ;
    }

    @Override
    public void payTaxes() {
        double tax = (cashInRegister * 0.10);
        double afterTax = cashInRegister - tax;
        System.out.println("after tax is : " +afterTax);

    }
}

