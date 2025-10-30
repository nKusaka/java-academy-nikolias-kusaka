package com.pluralsight;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Togemon("Togemon"));
        pokemons.add(new Charizard("Charizard"));

        for (Pokemon pokemon: pokemons) {
            System.out.printf("%s used %s", pokemon.getName(), pokemon.Attack());
        }
    }
}