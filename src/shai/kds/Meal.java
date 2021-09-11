package shai.kds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Meal {
    private LinkedList<ItemInterface> items;

    public Meal() {
        items = new LinkedList<ItemInterface>();
    }

    public void addItem(ItemInterface item) {
        items.addLast(item);
    }

    public void showItems() {
        for (ItemInterface item : items) {
            System.out.println("Item : " + item.name());
            System.out.println(", Packing : " + item.prepare().pack());
            System.out.println("Price : " + item.price());

        }
    }

    public float getCost() {
        float cost = 0.0f;
        for (ItemInterface item : items) {
            cost += item.price();
        }
        return cost;
    }
}
