package com.pluralsight;

public class Charizard extends Pokemon {

    public Charizard(String name) {
        super(name);
    }

    @Override
    public String Attack() {
        return "Flamethrower";
    }
}
