package net.javaguide.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Item {
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String name;
    private int quantity;

    public static void main(String[] args) {
        List<Item> lst = new ArrayList<>();
        lst.add(new Item("shirt", 4));
        lst.add(new Item("pant", 3));
        lst.add(new Item("shirt", 2));
        lst.add(new Item("pant", 1));
        lst.add(new Item("t-shirt", 7));
        //return - shirt = 6, pant = 4, t-shirt = 7

     Map<String, Integer> groupedMap = lst.stream().collect(Collectors.groupingBy(
             Item::getName,
             Collectors.summingInt(Item::getQuantity)
     ));
    }
}
