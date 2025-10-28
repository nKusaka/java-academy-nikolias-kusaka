package com.pluralsight;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chemist c1 = new WalterWhite();
        Chemist c2 = new JessePinkman();

        ArrayList<Chemist> chemists = new ArrayList<>();
        chemists.add(c1);
        chemists.add(c2);

        for (Chemist chemist: chemists) {
            chemist.cook();
        }
    }
}