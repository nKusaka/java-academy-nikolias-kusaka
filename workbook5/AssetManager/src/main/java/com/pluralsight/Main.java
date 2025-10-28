package com.pluralsight;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("my house", "2012", 100000, "21 Jump Street", 5000, 10000));
        assets.add(new House("your house", "2025", 1000000, "22 Jump Street", 10000, 100000));
        assets.add(new Vehicle("my car", "2025", 10000, "Honda civic", 2025, 0));
        assets.add(new Vehicle("your car", "2012", 5000, "Honda civic", 2010, 10000));

        for (Asset asset: assets) {
            System.out.printf("%s was acquired in %s, amount paid was %.2f, and its value today is %.2f\n",
                    asset.getDescription(), asset.getDateAcquired(), asset.getOriginalCost(), asset.getValue());
        }



    }
}