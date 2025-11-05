package com.pluralsight;


public class Main {
    public static void main(String[] args) {
        FixedList<Object> list = new FixedList<>(2);

        list.add(3);
        list.add("Nik");
        list.add(3.1);

        for(Object item: list.getItems()) {
            System.out.println(item);
        }
    }
}