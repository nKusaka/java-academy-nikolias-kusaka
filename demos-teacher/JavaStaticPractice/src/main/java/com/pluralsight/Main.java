package com.pluralsight;

public class Main {
        public static void main(String[] args) {

            Saiyan sonic = new Saiyan("Sonic", 100);
            Saiyan goku = new Saiyan("Goku", 10000);
            Saiyan s5 = new Saiyan("Vegta", 9999);
            Saiyan s3 = new Saiyan("Brock", 9000);
            Saiyan s4 = new Saiyan("Mario", 1001);
            sonic.setPowerlevel(200);
            goku.setPowerlevel(5000);

            //goku.showStats();
            // sonic.showStats();


            Saiyan.showTotalSaiyans();
            Saiyan.showAllSaiyansStats();
            //static method is not connected to a specific Saiyan,
            //but it's a generic method for all Saiyans
            //It's a class method


//        Math.abs(-2200);
//
//        Calculator calculator1 = new Calculator();
//        calculator1.add(2,5);
//
//        Calculator calculator2 = new Calculator();
//        calculator2.add(2,5);
//
//
//        Calculator.add(2,5);
//        Calculator.min(5,2);


            System.out.println("Let's save the princess!");
        }
    }

