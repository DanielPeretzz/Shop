package com.homework.daniel.shop.Model.Shop;

import com.homework.daniel.shop.Model.Employee.Person;
import com.homework.daniel.shop.Tax.Business;

public abstract class Shop implements Business {
    public Shop(Person owner, Person cashier, boolean isClosed) {
        this.owner = owner;
        this.cashier = cashier;
        this.isClosed = isClosed;
    }

    private Person owner;
    private Person cashier;
    public int cashInRegister = 0;
    private boolean isClosed = true;


    public void open(){
        System.out.println("the shop is open now!");
    }
    public void close(){
        System.out.println("the shop is close now!");
    }

    public abstract void purchaseItem(String name , float amountOfMoney);

    public static void whichIsMoreSuccessful(Shop s1, Shop s2){
        if(s1.cashInRegister > s2.cashInRegister){
            System.out.println(s1.toString() + " make more money");
        }
        else {
            System.out.println(s2+ " make more money");
        }
    }

    public Person getOwner() {
        return owner;
    }

    public Person getCashier() {
        return cashier;
    }

    public int getCashInRegister() {
        return cashInRegister;
    }

    public boolean isClosed() {
        return isClosed;
    }

}
