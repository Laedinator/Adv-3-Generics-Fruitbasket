package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class Launcher {

    public static void main(String[] args) {
        // TODO Try and use the FruitBasket class for different kind of fruits and also for a mix of fruits
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        Fruit pear = new Pear();
        Fruit pear2 = new Pear();
        Fruit apple2 = new Apple();


        FruitBasket fruitBasket = new FruitBasket<>();
        fruitBasket.add(apple);
        fruitBasket.add(banana);
        fruitBasket.add(pear);
        fruitBasket.add(pear2);

        System.out.println(fruitBasket.toString());
        System.out.println("This fruit was removed:");
        System.out.println(fruitBasket.get());
        System.out.println();
        System.out.println(fruitBasket.toString());

        boolean containsFruit = fruitBasket.contains(apple);
        System.out.println(containsFruit);
    }
}