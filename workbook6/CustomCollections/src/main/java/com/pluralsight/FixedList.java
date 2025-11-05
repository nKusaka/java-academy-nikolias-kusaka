package com.pluralsight;
import java.util.*;

public class FixedList <T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (items.size() != maxSize) {
            items.add(item);
        }
        else {
            System.out.println("List is full unable to add item");
        }
    }

    public List<T> getItems() {
        return items;
    }
}
