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
            if (asset instanceof House) {
                System.out.println(asset.getDescription() + " the address is " + ((House) asset).getAddress() +
                        " the price per square foot of the house is $" + asset.getValue());
            }
            if (asset instanceof Vehicle) {
                System.out.println(asset.getDescription() + " the make and model of the vehicle is " + ((Vehicle) asset).getMakeModel()
                + " the price of the car now is $" + asset.getValue());
            }
        }



    }
}