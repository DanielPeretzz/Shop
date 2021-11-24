package com.homework.daniel.shop.Model.Shop;

import com.homework.daniel.shop.Model.Employee.Person;
import com.homework.daniel.shop.Model.Shop.Products.Game;

import java.util.Objects;

public class GameShop extends Shop{
    Game game = new Game();
    public Game games;

    public GameShop(Person owner, Person cashier, boolean isClosed) {
        super(owner, cashier, isClosed);

    }

    @Override
    public void purchaseItem(String name, float amountOfMoney) {
        int index = 0;
        for (int i = 0; i < game.game.length ; i++) {
            if(Objects.equals(name, game.game[i])){
                index = i ;
            }
        }
        System.out.println("you purchase : "+game.game[index]+ " in : "+ game.price[index]);
        cashInRegister += game.price[index];

    }

    @Override
    public String toString() {
        return "GameShop{" +
                "game=" + game +
                ", games=" + games +
                ", cashInRegister=" + cashInRegister +
                "} ";
    }

    public Game getGame() {
        return game;
    }

    public Game getGames() {
        return games;
    }

    @Override
    public void payTaxes() {
        double tax = (cashInRegister * 0.15);
        double afterTax = cashInRegister - tax;
        System.out.println("after tax is : " +afterTax);

    }
}
