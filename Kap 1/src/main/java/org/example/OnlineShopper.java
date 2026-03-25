package org.example;

import BagADT.BagADT;

public class OnlineShopper {
    public static void main(String[] args) {

    }

    Item[] items = {
            new Item("Bird feeder", 4930),
            new Item("Squerl guard", 1547),
            new Item("Snake guard", 1547),
            new Item("Bear guard", 1547)
    };

    BagADT<Item> shoppingCart = new Bag<>();

}